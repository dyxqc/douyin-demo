package com.itmnms.douyin.demo8;

public class Test5 {
    public static void main(String[] args) {

        int age = 50;

        //int转String 方法一
        String bridgeAge = String.valueOf(age);

        //int转String 方法二
        bridgeAge = Integer.toString(age);

        //String转int
        String a = "40";
        int b = Integer.parseInt(a);

        //String转Integer
        Integer c = Integer.valueOf(a);
    }
}
