package com.itmnms.douyin.demo3;

public class Dog {

    public Dog() {
        System.out.println("Dog() 构造器");
    }

    {
        System.out.println("普通代码块");
    }

    static {
        System.out.println("静态代码块");
    }


    public static void main(String[] args) {
        //创建一个对象 方法执行的顺序？
        new Dog();//第一个Dog对象
        System.out.println("-------------");
        new Dog();//第二个Dog对象

        //划重点：类只会初始化一次，而每个对象也只会各自初始化一次
    }
}
