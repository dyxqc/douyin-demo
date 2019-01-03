package com.itmnms.douyin.demo7;


class Animal {

    private final void move() {
        System.out.println("Animal move");
    }
}

public class Dog extends Animal {

    private final void move() {
        System.out.println("Dog move");
    }

    public static void main(String[] args) {
        // ***** 阿里巴巴Java笔试题 *****
        // ***** 此代码执行结果？或者编译会报错吗？*****
        Dog dog = new Dog();
        dog.move();

        //划重点：private和final修饰的方法不能够被重写。
    }
}
