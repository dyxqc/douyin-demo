package com.itmnms.douyin.demo8;

public class TestThread {

    public static void a() {
        System.out.print("加油");
    }

    public static void main(String[] args) {
        //***** 大众点评网Java笔试题: 以下程序输出的结果？*****

        //A：南京加油
        //B：加油南京  right
        //C：以上都有可能

        Thread thread = new Thread() {
            public void run(){
                a();
            }
        };

        thread.run();

        System.out.print("南京");
    }


}
