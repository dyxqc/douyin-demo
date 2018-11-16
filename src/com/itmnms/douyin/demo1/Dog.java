package com.itmnms.douyin.demo1;

/**
 * 一个类的组成
 */
public class Dog {

    String name;
    int price;

    public Dog() {
        System.out.println("Dog() 构造方法");
    }

    {
        System.out.println("Dog 普通代码块");
    }

    static {
        System.out.println("Dog 静态代码块");
    }

    public void eat() {
        System.out.println("Dog eat()方法");
    }

    public class BigDog {

        public void wangwang() {
            System.out.println("BigDog 非静态内部类");
        }
    }

    public static class LittleDog {
        public void wangwang() {
            System.out.println("LittleDog 静态内部类");
        }
    }

    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("匿名内部类");
        }
    });
}
