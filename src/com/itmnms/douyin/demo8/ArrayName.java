package com.itmnms.douyin.demo8;

public class ArrayName {
    public static void main(String[] args) {
        //***** 数组也是对象 *****
        String[] names = {"jack", "pony", "allen"};

        //既然数组是对象 那么一定会有toString方法
        System.out.println(names.toString());

        System.out.println(names.length);

    }
}
