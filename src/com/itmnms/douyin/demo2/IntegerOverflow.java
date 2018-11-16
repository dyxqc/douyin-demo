package com.itmnms.douyin.demo2;

public class IntegerOverflow {
    public static void main(String[] args) {

        //一个让你抓狂的加法计算 前方高能预警：结果很意外

        int a = Integer.MAX_VALUE;
        long b = a + 1;

        //猜猜看 结果是多少呢？
        System.out.println(b);

        //**** 划重点：整数的相加 默认都是以int类型进行计算 *****
    }
}
