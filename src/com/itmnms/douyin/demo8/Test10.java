package com.itmnms.douyin.demo8;

import java.math.BigDecimal;

public class Test10 {

    public static void main(String[] args) {
        float a = 0.7F - 0.6F;
        float b = 0.8F - 0.7F;

        System.out.println(a == b);

        System.out.println(a);
        System.out.println(b);

        System.out.println("----------");

        BigDecimal b6 = new BigDecimal("0.6");
        BigDecimal b7 = new BigDecimal("0.7");
        BigDecimal b8 = new BigDecimal("0.8");

        boolean flag = b7.subtract(b6).equals(b8.subtract(b7));

        System.out.println(flag);

    }
}
