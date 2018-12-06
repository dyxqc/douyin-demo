package com.itmnms.douyin.demo6;

public class Bike {

    public static Bike bike1 = new Bike();
    public static Bike bike2 = new Bike();

    {
        System.out.println("构造代码块");
    }

    static
    {
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {
        //***** 阿里巴巴Java笔试题：以下代码执行的结果 *****

        new Bike();

        //划重点：静态代码块优先构造代码块，且静态变量和静态代码块按照顺序执行。
    }

}
