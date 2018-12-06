package com.itmnms.douyin.demo5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        //格式化时间 会么？
        //不会... 就跟着我抖音的节奏，一起摇摆...

//        //案例一：将时间转换为字符串
//        Date now = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
//        System.out.println(sdf.format(now));

        //案例二：将字符串转换为时间对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
        Date date = sdf.parse("2018-11-20 21:22:01");
        System.out.println(date);


    }
}
