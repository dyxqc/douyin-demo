package com.itmnms.douyin.demo4;

public class Animal {

    public Animal() {
        System.out.println("Animal构造方法");
    }

    {
        System.out.println("Animal普通代码块");
    }

    static {
        System.out.println("Animal静态代码块");
    }
}

class Dog extends Animal {

    public Dog() {
        System.out.println("Dog构造方法");
    }

    {
        System.out.println("Dog普通代码块");
    }

    static {
        System.out.println("Dog静态代码块");
    }

    public static void main(String[] args) {
        //面试题：创建Dog对象 输出结果是？
        new Dog();
        //划重点：先父后子，先静态后对象。
    }
}
