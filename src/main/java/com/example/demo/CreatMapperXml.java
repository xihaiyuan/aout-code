package com.example.demo;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
public class CreatMapperXml {
    public  void creatMapperXml() {
        //todo 根据表名生成命名空间
        String Namespace = "com.maoyan.air.nb.toolplatform.dao.mapper.manual.WishPOManualMapper";
        // 创建Document
        Document document = DocumentHelper.createDocument();
        document.addDocType("mapper","PUBLIC","-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd");
        // 添加根节点
        Element root = document.addElement("mapper").addAttribute("namespace",Namespace);
        //todo 根据表名生成PO路径
        String parameterType = "com.maoyan.air.nb.toolplatform.domain.schema.WishPO";

        //todo 获取原生PO地址
        String resultType ="com.maoyan.air.nb.toolplatform.domain.schema.WishPO";

        //todo 表名
        String tableName ="tp_wish";
        //todo 获取生成的xml原生文件地址
        String refid = "com.maoyan.air.nb.toolplatform.dao.mapper.WishPOMapper.Base_Column_Lis";
        //创建语句
        Element queryConditionElement = createQueryConditionXml(root,tableName,parameterType);
        Element insertElement = createInsertXml(root,tableName,parameterType);
        Element updateElement =  createUpdateXml(root,tableName,parameterType);
        Element createGetListXml = createGetListXml(root,tableName,resultType,refid);
        Element createGetCountXml = createGetCountXml(root,tableName,resultType,refid);

        OutputFormat format = OutputFormat.createPrettyPrint();
        //todo 根据表名生成文件名
        String file = "src/main/test/test.xml";
        XMLWriter writer = null;
        try {
            writer = new XMLWriter( new FileOutputStream(file), format);
            //生成文件
            writer.write(document);

            System.out.println(prettysString(document));

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("dom4j CreateDom4j success!");


    }

    /***
     * 创建新增xml
     */
    public Element createInsertXml(Element root,String tableName,String parameterType){
        // 在根节点下添加新增操作
        Element insertElement= root.addElement("insert")
                .addAttribute("useGeneratedKeys", "true")
                .addAttribute("keyProperty","id")
                .addAttribute("keyColumn","id")
                .addAttribute("parameterType",parameterType);

        insertElement
                .addText("insert into " + tableName );

        Element TrimTitle = insertElement.addElement("trim")
                .addAttribute("prefix", "(")
                .addAttribute("suffix", ")")
                .addAttribute("suffixOverrides", ",");

        //todo 循环表字段生成 title
        for (int i=0; i<10; i++){
            TrimTitle.addElement("if")
                    .addAttribute("test","userId != null")
                    .addText("user_id");
        }


        Element TrimValues = insertElement.addElement("trim")
                .addAttribute("prefix", "values (")
                .addAttribute("suffix", ")")
                .addAttribute("suffixOverrides", ",");

        //todo 循环表字段 values
        TrimValues.addElement("if")
                .addAttribute("test","userId != null")
                .addText(" #{userId,jdbcType=INTEGER}, ");

        return insertElement;
    }
    //生成修改语句
    public Element createUpdateXml(Element root,String tableName,String parameterType){
        Element updateElement= root.addElement("update")
                .addAttribute("useGeneratedKeys", "true")
                .addAttribute("parameterType",parameterType);

        updateElement
                .addText(" update " + tableName );

        Element set = updateElement.addElement("set");

        //todo 读取表字段循环
        set.addElement("if")
                .addAttribute("test","userId != null")
                .addText(" #{userId,jdbcType=INTEGER}, ");


        updateElement.addText(" where id = #{id,jdbcType=INTEGER}");

        return updateElement;
    }

    //生成查询条件字段语句
    public Element createQueryConditionXml(Element root,String tableName,String parameterType){
        Element queryConditionElement = root.addElement("sql").addAttribute("id","queryCondition");
        Element TrimValues = queryConditionElement.addElement("trim")
                .addAttribute("prefix", " WHERE ")
                .addAttribute("suffixOverrides", "AND | OR");

        //todo 循环表字段 values PO 替换
        TrimValues.addElement("if")
                .addAttribute("test","status != null")
                .addText("  and status = #{wishPO.status,jdbcType=TINYINT} ");

        return queryConditionElement;
    }

    //查询列表
    public Element createGetListXml(Element root,String tableName,String resultType,String refid){
        Element getListElement = root.addElement("select")
                .addAttribute("id","getList")
                .addAttribute("resultType",resultType);

        getListElement.addText("select");
        getListElement.addElement("include").addAttribute("refid",refid);
        getListElement.addText("from "+tableName);
        getListElement.addText(" where ");
        getListElement.addElement("include").addAttribute("refid","queryCondition");

        getListElement.addElement("if").addAttribute("test"," offset != null and limit != nul ").addText("  limit #{offset},#{limit} ");

        return getListElement;
    }

    public Element createGetCountXml(Element root,String tableName,String resultType,String refid){
        Element countElement = root.addElement("select")
                .addAttribute("id","getCount")
                .addAttribute("resultType","java.lang.Integer");

        countElement.addText("select count(id) ");
        countElement.addText("from "+tableName);
        countElement.addText(" where ");
        countElement.addElement("include").addAttribute("refid","queryCondition");

        return countElement;
    }
    /***
     * 格式化xml为string
     *
     * @param document
     * @return
     * @throws IOException
     */
    protected String prettysString(Document document) throws IOException {
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding(document.getXMLEncoding());
        StringWriter stringWriter = new StringWriter();
        XMLWriter writer = new XMLWriter(stringWriter, format);
        writer.write(document);
        writer.close();
        return stringWriter.toString();
    }

}
