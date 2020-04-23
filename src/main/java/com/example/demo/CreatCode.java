package com.example.demo;


import org.springframework.util.CollectionUtils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CreatCode {


    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String pwd = "tool_platform";
    private static final String user = "tool_platform";
    private static final String url = "jdbc:mysql://10.24.98.250:5002/air_nb_tool_platform"
            + "?user=" + user + "&password=" + pwd
            + "&useUnicode=true&characterEncoding=UTF-8";
    private static Connection getConnection = null;

    private static final String objectTable = "clock_media";

    public static void main(String[] args) {
        GetPoFileList getPoFileList = new GetPoFileList();
        CreateJavaDocument javaDocument = new CreateJavaDocument();
        CreatMapperXml creatMapperXml = new CreatMapperXml();
        // List<String> list = GetPoFileList.getFiles("/Users/yuanjianming/Documents/work/air-nb-tool-platform/domain/src/main/java/com/maoyan/air/nb/toolplatform/domain/schema");
        // System.out.print(list);
        //creatMapperXml.creatMapperXml();
        //javaDocument.creatJavaDto();
        //javaDocument.creatAdapter();
        //javaDocument.creatService();
        //javaDocument.creatBiz();
        //javaDocument.creatBiz();

        List<Field> fieldList = getDbTableInfo();
        System.out.println(fieldList);

        if (CollectionUtils.isEmpty(fieldList)) {
            System.out.println("无数据");
        }else{
            javaDocument.creatJavaDto(fieldList);
        }
    }

    public static List<Field> getDbTableInfo() {
        List<Field> fieldList = new ArrayList();
        try {
            getConnection = DBHelpInfo.getConnections(driver, url);
            DatabaseMetaData dbmd = getConnection.getMetaData();
            ResultSet resultSet = dbmd.getTables(null, "%", "%", new String[]{"TABLE"});

            while (resultSet.next()) {
                String tableName = resultSet.getString("TABLE_NAME");
                System.out.println(tableName);
                if (tableName.equals(objectTable)) {
                    ResultSet rs = dbmd.getColumns(null, "%", tableName, "%");
                    System.out.println("表名：" + tableName + "\t\n表字段信息：");
                    while (rs.next()) {
                        Field field = new Field();

                        System.out.println("字段名：" + rs.getString("COLUMN_NAME") + "\t字段注释：" + rs.getString("REMARKS") + "\t字段数据类型：" + rs.getString("TYPE_NAME"));

                        field.setColumnName(rs.getString("COLUMN_NAME"));
                        field.setComment(rs.getString("REMARKS"));
                        field.setTypeName(rs.getString("TYPE_NAME"));

                        fieldList.add(field);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fieldList;
    }
}



