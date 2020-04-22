package com.example.demo;

import com.squareup.javapoet.*;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

import javax.lang.model.element.Modifier;
import javax.swing.*;

import sun.reflect.generics.scope.ClassScope;

import java.io.Serializable;
import java.lang.annotation.Documented;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




@SpringBootApplication
@RestController

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RequestMapping(value = "/test")
	public void test() {
		//生成类构造器
		TypeSpec.Builder helloWorldBuilder=TypeSpec.classBuilder("test1");

		MethodSpec main=MethodSpec.methodBuilder("main")//方法的构造器

				.addParameter(String[].class,"args")//添加参数
				.returns(void.class)//添加返回值
				.addStatement("$T.out.println($S)",System.class,"helloWorld")//添加内容
				.addStatement("$T.out.println($L)",System.class,100L)//显示字符
				.build();

		TypeSpec helloWorld=helloWorldBuilder.addMethod(main).build();

		//Java文件生成
		JavaFile javaFile=JavaFile.builder("com.itcast.lyc",helloWorld).build();

		try {
			//把文件内容写入到 窗口打印出来
			javaFile.writeTo(System.out);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@RequestMapping(value = "/test2")
	public void test2() {
		MethodSpec main = MethodSpec.methodBuilder("main")
				.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
				.returns(void.class)
				.addParameter(String[].class, "args")
				.addStatement("$T.out.println($S)", System.class, "Hello, JavaPoet!")
				.build();

		MethodSpec main2 = MethodSpec.methodBuilder("main2")
				.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
				.returns(void.class)
				.addParameter(String[].class, "args")
				.addStatement("$T.out.println($S)", System.class, "Hello, JavaPoet!")
				.build();

		TypeSpec helloWorld = TypeSpec.classBuilder("HelloWorld")
				.addModifiers(Modifier.PUBLIC, Modifier.FINAL)
				.addMethod(main)
				.addMethod(main2)
				.build();



		JavaFile javaFile = JavaFile.builder("com.example.helloworld", helloWorld)
				.build();



		try {
			//把文件内容写入到 窗口打印出来
			javaFile.writeTo(System.out);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@RequestMapping(value = "/test3")
	public void creatMapperXml() {

        //todo 根据表名生成命名空间
		String Namespace = "com.maoyan.air.nb.toolplatform.dao.mapper.manual.WishPOManualMapper";

		// 创建Document
		Document document = DocumentHelper.createDocument();
		document.addDocType("mapper","PUBLIC","-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd");
		// 添加根节点
		Element root = document.addElement("mapper").addAttribute("namespace",Namespace);

		//todo 根据表名生成PO路径
		String ParameterType = "com.maoyan.air.nb.toolplatform.domain.schema.WishPO";

		//todo 表名
		String TableName ="tp_wish";

		// 在根节点下添加新增操作
		Element insertElement= root.addElement("insert")
				.addAttribute("useGeneratedKeys", "true")
				.addAttribute("keyProperty","id")
				.addAttribute("keyColumn","id")
				.addAttribute("parameterType",ParameterType);

		insertElement
				.addText("insert into " + TableName );

		Element TrimTitle = insertElement.addElement("trim")
				.addAttribute("prefix", "(")
				.addAttribute("suffix", ")")
				.addAttribute("suffixOverrides", ",");

		//todo 循环表字段生成
		TrimTitle.addElement("if")
				.addAttribute("test","userId != null")
		        .addText("user_id");

		Element TrimValues = insertElement.addElement("trim")
				.addAttribute("prefix", "values (")
				.addAttribute("suffix", ")")
				.addAttribute("suffixOverrides", ",");

		//todo 循环表字段
		TrimValues.addElement("if")
				.addAttribute("test","userId != null")
				.addText(" #{userId,jdbcType=INTEGER}, ");





		OutputFormat format = OutputFormat.createPrettyPrint();
        //todo 根据表名生成文件名
		String file = "test.xml";
		XMLWriter writer = null;
		try {
			writer = new XMLWriter( new FileOutputStream(file), format);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		try {
			writer.write(document);

			System.out.println(prettysString(document));

		} catch (IOException e) {
			e.printStackTrace();
		}


		System.out.println("dom4j CreateDom4j success!");


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
