package com.example.demo;

import com.squareup.javapoet.*;
import org.springframework.stereotype.Service;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogRecord;

@RestController
public class CreateJavaDocument {
    //生成dot
    public  void creatJavaDto(List<Field> fieldList) {

        List<FieldSpec> specsList = new ArrayList<>();

        fieldList.forEach(item->{
            String typeClass =  item.getTypeName()+".class";

            FieldSpec fieldSpec =FieldSpec.builder(String.class, item.getColumnName(), Modifier.PRIVATE).addJavadoc(item.getComment()).build();
            specsList.add(fieldSpec);
        });



        TypeSpec helloWorld = TypeSpec.classBuilder("WishDTO")
                .addModifiers(Modifier.PUBLIC)
                .addSuperinterface(Serializable.class)
                .addAnnotation(Data.class)
                //.addField(fieldSpec)//单个增加属性
                .addFields(specsList) //批量增加属性
                .build();


        //todo 生成命名空间
        String packageName = "com.maoyan.air.nb.toolplatform.domain.dto";

        JavaFile javaFile = JavaFile.builder(packageName, helloWorld)
                .build();


        try {
            //把文件内容写入到 窗口打印出来
            javaFile.writeTo(System.out);
            javaFile.writeTo(new File("src/main/test"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //生成接口
    public void creatJavaInterface() {


        TypeSpec poMapper = TypeSpec.interfaceBuilder("poMapper")
                .addModifiers(Modifier.PUBLIC)

                .addMethod(MethodSpec.methodBuilder("insert")
                        .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                        .returns(int.class)
                        .build())
                .addMethod(MethodSpec.methodBuilder("update")
                        .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                        .returns(int.class)
                        .build())
                .addMethod(MethodSpec.methodBuilder("getList")
                        .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                        .returns(int.class)
                        .build())
                .addMethod(MethodSpec.methodBuilder("getCount")
                        .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                        .returns(int.class)
                        .build())
                .build();

        //todo 生成命名空间
        String packageName = "com.maoyan.air.nb.toolplatform.domain.poMapper";

        JavaFile javaFile = JavaFile.builder(packageName, poMapper)
                .build();

        try {
            //把文件内容写入到 窗口打印出来
            javaFile.writeTo(System.out);
            javaFile.writeTo(new File("src/main/test"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //生成Adapter文件
    public void creatAdapter(){
        //获取po文件地址：

        //todo 提取po与dot名

        FieldSpec fieldSpec = FieldSpec.builder(String.class, "Adapter", Modifier.PRIVATE).build();

        //todo 生成DOT命名空间
        //DTO的命名空间
        String DtoPackageName = "com.maoyan.air.nb.toolplatform.domain.dto";
        ClassName bundleDto = ClassName.get(DtoPackageName, "WishDTO");
        //方法的参数
        ParameterSpec ParameterDTO = ParameterSpec.builder(bundleDto, "wishDto")
                .build();

        //todo 生成PO命名空间
        //PO的命名空间
        String PoPackageName = "com.maoyan.air.nb.toolplatform.domain.dto";
        ClassName bundlePo = ClassName.get(PoPackageName, "WishPO");
        //方法的参数
        ParameterSpec ParameterPo = ParameterSpec.builder(bundlePo, "wishPO")
                .build();


        ClassName hoverboard = ClassName.get("com.mattel", "Hoverboard");
        ClassName list = ClassName.get("java.util", "List");
        ClassName arrayList = ClassName.get("java.util", "ArrayList");
        TypeName listOfHoverboards = ParameterizedTypeName.get(list, hoverboard);

        MethodSpec dtoToPo = MethodSpec.methodBuilder("dtoToPo")
                .addModifiers(Modifier.PUBLIC,Modifier.STATIC)
                .addParameter(ParameterDTO)
                .beginControlFlow("if (wishDto == null)", System.class)
                .addStatement("return null")
                .endControlFlow()

                .addStatement("$T wishPO = new $T()", bundlePo, bundlePo)
                //todo 循环表字段
                .addCode("wishPO.setId(wishDto.getTest);\n",bundlePo,bundleDto)
                //返回po
                .addStatement("return $T", bundlePo)
                .returns(bundlePo)
                .build();

        TypeSpec Adapter = TypeSpec.classBuilder("Adapter")
                .addModifiers(Modifier.PUBLIC)
                .addSuperinterface(Serializable.class)
                //.addAnnotation(Data.class)
                .addMethod(dtoToPo)
                .addField(fieldSpec)
                .build();


        //todo 生成命名空间
        String packageName = "com.maoyan.air.nb.toolplatform.domain.Adapter";

        JavaFile javaFile = JavaFile.builder(packageName, Adapter)
                .build();

        try {
            //把文件内容写入到 窗口打印出来
            javaFile.writeTo(System.out);
            //生成文件的根目录
            javaFile.writeTo(new File("src/main/test"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //生成Service
    public void creatService(){
        //todo 生成DOT命名空间
        //DTO的命名空间
        String DtoPackageName = "com.maoyan.air.nb.toolplatform.domain.dto";
        ClassName bundleDto = ClassName.get(DtoPackageName, "WishDTO");
        ClassName list = ClassName.get("java.util", "List");
        ClassName arrayList = ClassName.get("java.util", "ArrayList");

        TypeName listDto = ParameterizedTypeName.get(list, bundleDto);


        //方法的参数
        ParameterSpec ParameterDTO = ParameterSpec.builder(bundleDto, "wishDto")
                .build();

        ParameterSpec limit = ParameterSpec.builder(Integer.class, "limit")
                .build();
        ParameterSpec offset = ParameterSpec.builder(Integer.class, "offset")
                .build();

        TypeSpec poMapper = TypeSpec.interfaceBuilder("IWishService")
                .addModifiers(Modifier.PUBLIC)

                .addMethod(MethodSpec.methodBuilder("insert")
                        .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                        .returns(int.class)
                        .addParameter(ParameterDTO)
                        .build())
                .addMethod(MethodSpec.methodBuilder("update")
                        .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                        .returns(int.class)
                        .addParameter(ParameterDTO)
                        .build())
                .addMethod(MethodSpec.methodBuilder("getList")
                        .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                        .returns(listDto)
                        .addParameter(ParameterDTO)
                        .addParameter(limit)
                        .addParameter(offset)
                        .build())
                .addMethod(MethodSpec.methodBuilder("getCount")
                        .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                        .returns(int.class)
                        .addParameter(ParameterDTO)
                        .build())
                .build();

        //todo 生成命名空间
        String packageName = "com.maoyan.air.nb.toolplatform.domain.service";

        JavaFile javaFile = JavaFile.builder(packageName, poMapper)
                .build();

        try {
            //把文件内容写入到 窗口打印出来
            javaFile.writeTo(System.out);
            javaFile.writeTo(new File("src/main/test"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //生成biz层代码
    public void creatBiz(){

        String DtoPackageName = "com.maoyan.air.nb.toolplatform.domain.dto";
        ClassName bundleDto = ClassName.get(DtoPackageName, "WishDTO");
        ClassName list = ClassName.get("java.util", "List");
        ClassName arrayList = ClassName.get("java.util", "ArrayList");

        TypeName listDto = ParameterizedTypeName.get(list, bundleDto);



        ParameterSpec limit = ParameterSpec.builder(Integer.class, "limit")
                .build();
        ParameterSpec offset = ParameterSpec.builder(Integer.class, "offset")
                .build();

        String servicePackageName = "com.maoyan.air.nb.toolplatform.domain.service";
        ClassName InterFaceService = ClassName.get(servicePackageName, "IWishService");

        ParameterSpec ParameterDTO = ParameterSpec.builder(bundleDto, "wishDto")
                .build();

        FieldSpec fieldSpec = FieldSpec.builder(InterFaceService, "wishService", Modifier.PRIVATE)
                 .addAnnotation(Resource.class)
                 .build();

        TypeSpec biz = TypeSpec.classBuilder("WishBiz")
                .addModifiers(Modifier.PUBLIC)
                .addAnnotation(Service.class)
                .addField(fieldSpec)
                .addMethod(MethodSpec.methodBuilder("insert")
                        .addJavadoc("新增操作")
                        .addModifiers(Modifier.PUBLIC)
                        .returns(int.class)
                        .addParameter(ParameterDTO)
                        .addCode("return wishService.insert(wishDto);\n",bundleDto,bundleDto)
                        .build())
                .addMethod(MethodSpec.methodBuilder("update")
                        .addJavadoc("更新操作")
                        .addModifiers(Modifier.PUBLIC)
                        .returns(int.class)
                        .addParameter(ParameterDTO)
                        .addCode("return wishService.update(wishDto);\n",bundleDto,bundleDto)
                        .build())
                .addMethod(MethodSpec.methodBuilder("getCount")
                        .addJavadoc("获取总数")
                        .addModifiers(Modifier.PUBLIC)
                        .returns(int.class)
                        .addParameter(ParameterDTO)
                        .addCode("return wishService.getCount(wishDto);\n",bundleDto,bundleDto)
                        .build())
                .addMethod(MethodSpec.methodBuilder("getList")
                        .addJavadoc("获取数据列表")
                        .addModifiers(Modifier.PUBLIC)
                        .returns(listDto)
                        .addCode("return wishService.getList(wishDto,limit,offset);\n",bundleDto,bundleDto)
                        .addParameter(ParameterDTO)
                        .addParameter(limit)
                        .addParameter(offset)
                        .build())
                .build();





        //todo 生成命名空间
        String packageName = "com.maoyan.air.nb.toolplatform.domain.Biz";

        JavaFile javaFile = JavaFile.builder(packageName, biz)
                .build();

        try {
            //把文件内容写入到 窗口打印出来
            javaFile.writeTo(System.out);
            //生成文件的根目录
            javaFile.writeTo(new File("src/main/test"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
