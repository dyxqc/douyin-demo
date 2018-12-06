package com.itmnms.douyin.demo6;

public class Book {

    private String name;

    public Book() {
//        System.out.println();
        this("Java从入门到发工钱");//必须放在第一行
    }

    public Book(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // ***** 构造方法的调用 *****
        new Book();
        new Book("Java从入门到放弃");
    }
}
