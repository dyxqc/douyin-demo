package com.itmnms.douyin.demo7;

public class StringEquals {

    public static void main(String args[]) {

        // **** 阿里巴巴Java笔试题： 字符串比较*****
        String a = "123456";
        String b = "123456";

        String c = new String("123456");

        //true a和b都是指向常量池
        System.out.println(a == b);

        //false c变量指向堆内存的String对象
        System.out.println(a == c);

        //true 重写equals方法比较字符
        System.out.println(a.equals(c));
    }
}
