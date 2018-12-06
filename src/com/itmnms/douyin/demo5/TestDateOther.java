package com.itmnms.douyin.demo5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TestDateOther {

    public static void main(String[] args) {

        //********* 格式化时间的坑 前方有坑 请避让 *********

//        Date now = new Date();//当前时间*********
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println("yyyy-MM-dd HH:mm:ss " + sdf.format(now));//输出格式化的时间
//
//        System.out.println("-----------------------------");
//
//        now = new Date();//当前时间
//        sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println("yyyy-MM-dd hh:mm:ss " + sdf.format(now));//输出格式化的时间

        //HH和hh有何区别呢？

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());

        LocalDate localDate2 = LocalDate.of(1881, 3, 15);
        System.out.println(localDate2.toString());

        long y = localDate2.until(localDate, ChronoUnit.YEARS);
        System.out.println(y);


        localDate = LocalDate.parse("2018/09/08", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(localDate.toString());


    }
}
