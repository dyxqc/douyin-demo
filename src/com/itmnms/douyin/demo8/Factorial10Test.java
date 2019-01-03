package com.itmnms.douyin.demo8;

public class Factorial10Test {

    public static void main(String[] args) {
        //***** Java编程题：求10的阶乘 *****
        //10 * 9 * 8 * 7 ... * 1 = ?

        int result = Factorial10Test.mul(100);
        System.out.println(result);
    }

    public static int mul(int number) {
        if (1 == number) {
            return number;
        }

        return number * mul(number - 1);
    }
}
