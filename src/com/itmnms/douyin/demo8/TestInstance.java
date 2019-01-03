package com.itmnms.douyin.demo8;

public class TestInstance {

    abstract static class Animal {
        abstract void move();
    }

    static class Dog extends Animal {
        @Override
        void move() {
            System.out.println("Dog move()");
        }

        void wangwang() {
            System.out.println("Dog wangwang");
        }
    }

    static class Cat extends Animal {
        @Override
        void move() {
            System.out.println("Cat move()");
        }
    }

    public static void zoo(Animal animal) {
        animal.move();

        //如果是条狗
        if (animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.wangwang();
        }

    }

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        zoo(dog);

        Cat cat = new Cat();
        zoo(cat);

    }
}
