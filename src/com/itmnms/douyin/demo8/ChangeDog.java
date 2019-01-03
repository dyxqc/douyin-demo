package com.itmnms.douyin.demo8;

public class ChangeDog {

    public static void changeDog(Dog dog) {
        dog.name = dog.name + "007";
    }

    public static void main(String[] args) {
        //***** 改变Dog对象的属性值 *****

        Dog dog = new Dog();
        dog.name = "wangcai";

        changeDog(dog);//修改dog

        System.out.println(dog.name);
    }

}

class Dog {
    public String name;
}

