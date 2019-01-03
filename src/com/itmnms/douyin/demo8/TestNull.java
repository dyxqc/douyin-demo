package com.itmnms.douyin.demo8;

public class TestNull {

    public static void a(String name) {
        if (name.equals("大猿向前冲")) {
            System.out.println(name + " 欧耶！");
        }
    }

    public static void b(String name) {
        if ("大猿向前冲".equals(name)) {
            System.out.println(name + " 欧耶！");
        }
    }

    public static void main(String[] args) {
        //***** 字符串比较的技巧 *****

//        a("大猿向前冲");
//        b("大猿向前冲");

//        a(null);
        b(null);
    }
}
