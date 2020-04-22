package com.example.demo;


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
        javaDocument.creatBiz();
    }
}
