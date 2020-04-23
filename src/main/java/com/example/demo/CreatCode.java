package com.example.demo;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CreatCode {
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

        try {
            init();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void init() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://10.24.98.250:5002/air_nb_tool_platform", "tool_platform", "tool_platform");

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from clock_media");

        ResultSetMetaData metaData = rs.getMetaData();
        int count = metaData.getColumnCount();

        List<Field> fieldList = new ArrayList();

        for(int i = 1; i<=count; i++){
            Field field = new Field();
            field.setName(metaData.getColumnName(i));
            field.setType(metaData.getColumnTypeName(i));

            fieldList.add(field);
        }



        System.out.println(fieldList);
    }



}
