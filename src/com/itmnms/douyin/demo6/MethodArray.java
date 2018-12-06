package com.itmnms.douyin.demo6;

import java.util.Arrays;

public class MethodArray {

    //声明一个不定参数
    public static void a(int... numbers) {
        //通过lambda遍历数组
        Arrays.asList(numbers).forEach(number -> System.out.println(number));
    }

    public static void b(int[] numbers) {
        Arrays.asList(numbers).forEach(number -> System.out.println(number));
    }

    public static void main(String[] args) {
        // ***** Java笔试题：不定参数的使用 *****
        MethodArray.a(2, 5, 1, 8, 3);//5个参数
        MethodArray.a(5, 9, 6);//3个参数

        MethodArray.b(new int[] {2, 5, 1, 8, 3});
    }
}
