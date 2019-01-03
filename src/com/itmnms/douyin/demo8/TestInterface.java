package com.itmnms.douyin.demo8;

public class TestInterface {

    //***** JDK8中接口新特性 *****

    interface Animal {
        void move();

        default void eat() {

        }
    }

    class Dog implements Animal {
        @Override
        public void move() {

        }
    }

    class Cat implements Animal {
        @Override
        public void move() {

        }
    }
}
