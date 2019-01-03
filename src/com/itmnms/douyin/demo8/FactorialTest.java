package com.itmnms.douyin.demo8;

import java.math.BigDecimal;

public class FactorialTest {

    public static void main(String[] args) {
        // **** 苏宁Java笔试题：100的阶乘 ****
        //100 * 99 * 98 * 97 ... * 2 * 1 = ?

        int number = 100;
        BigDecimal result = FactorialTest.mul(new BigDecimal(number));
        System.out.println(result.toString());
    }

    public static BigDecimal mul(BigDecimal number) {
        if (number.toString().equals(new BigDecimal("1").toString())) {
            return new BigDecimal("1");
        }

        return number.multiply(mul(number.subtract(new BigDecimal("1"))));

    }
}
