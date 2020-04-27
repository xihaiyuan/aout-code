/*
 * Copyright (c) 2020 maoyan.com
 * All rights reserved.
 *
 */
package com.example.demo;

/**
 * 在这里编写类的功能描述
 *
 * @author yuanjianming
 * @created 2020/4/26
 */
public class StrUtil {

    /**
     * 首字母小写
     * @param s
     * @return
     */
    public static String lowerFirstLetter(String s){
        String prix = s.substring(0, 1);
        String sufix = s.substring(1, s.length());
        return prix.toLowerCase() + sufix;
    }

    /**
     * 实体首字母大写
     * @param str
     * @return
     */
    public static String upperFirstLetter(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str 传入字符串
     * @return
     * @description 将传入字符串的首字母转成大写
     */
    private String initCap(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z')
            ch[0] = (char) (ch[0] - 32);
        return new String(ch);
    }

    /**
     * 数据库命名格式转java命名格式
     *
     * @param str
     *            数据库字段名
     * @return java字段名
     */
    public static String toJavaField(String str) {

        String[] split = str.split("_");
        StringBuilder builder = new StringBuilder();
        builder.append(split[0]);// 拼接第一个字符

        // 如果数组不止一个单词
        if (split.length > 1) {
            for (int i = 1; i < split.length; i++) {
                // 去掉下划线，首字母变为大写
                String string = split[i];
                String substring = string.substring(0, 1);
                split[i] = string.replaceFirst(substring, substring.toUpperCase());
                builder.append(split[i]);
            }
        }

        return builder.toString();
    }

}
