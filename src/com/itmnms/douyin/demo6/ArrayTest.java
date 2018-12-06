package com.itmnms.douyin.demo6;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        // ***** Java面试题：遍历数组的方式 *****

        String[] books = {"Java入门到放弃", "论程序猿的自我修养", "大龄程序猿的未来在哪里"};

        // case1 通过下标访问数组元素
        for (int i=0; i<books.length; i++) {
            System.out.println(books[i]);
        }

        System.out.println("-----------------");

        // case2 通过增强型for循环访问
        for (String book : books) {
            System.out.println(book);
        }

        System.out.println("-----------------");

        // case3 通过lambda表达式和forEach函数式接口
        Arrays.asList(books).forEach(book -> System.out.println(book));
    }
}
