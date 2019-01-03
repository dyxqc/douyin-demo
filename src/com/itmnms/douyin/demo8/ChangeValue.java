package com.itmnms.douyin.demo8;

public class ChangeValue {

    public static void change(String value) {
        value = value + "赞";
    }

    public static void main(String[] args) {
        //***** 初学者容易犯的错误：改变字符串的值 *****

        String name = "jack";

        change(name);//改变name的值

        System.out.println(name);
        //输出结果？
        //A: jack
        //B: jack赞
    }

}


