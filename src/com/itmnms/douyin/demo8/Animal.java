package com.itmnms.douyin.demo8;

public class Animal {

    private String name = "Animal";

    public Animal() {
        a();
    }

    public void a() {
        System.out.println(name);
    }

    class Dog extends Animal {

        public String name = "Dog";

        public void a() {
            System.out.println (name) ;
        }

//        public static void main(String[] args) {
//            //***** 阿里巴巴Java笔试题：以下程序输出的结果？*****
//            Animal animal = new Dog();
//        }

    }
}


