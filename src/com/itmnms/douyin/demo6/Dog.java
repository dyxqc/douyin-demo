package com.itmnms.douyin.demo6;

public class Dog {

    //成员变量name
    public String name = "wc007";

    public void a() {
        //定义局部变量name
        String name = "wc008";

        System.out.println("Dog name is " + name);
        System.out.println("Dog name is " + this.name);

        //划重点：通过this关键字来区分成员和局部变量
    }


    public static void main(String[] args) {

        // **** this关键字的使用 ****

        Dog dog = new Dog();
        dog.a();
    }

}