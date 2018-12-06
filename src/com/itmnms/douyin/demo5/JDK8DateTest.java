package com.itmnms.douyin.demo5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class JDK8DateTest {

    public static void main(String[] args) {
        // ******* JDK8新增时间类 *******

        //获取当前日期
        LocalDate currentDate = LocalDate.now();//2018-11-28
        //获取当前时间
        LocalTime currentTime = LocalTime.now();// 20:09:57
        //获取当前日期和时间
        LocalDateTime currentDateTime = LocalDateTime.now();//2018-11-28 20:09:57

        //格式化时间
        LocalDate localDate = LocalDate.parse("1987/11/28",
                DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("格式化日期：" + localDate.toString());

        //获取本月最后一天
        LocalDate lastDayOfMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("本月最后一天：" + lastDayOfMonth);

        //获取2018年最后一个星期五
        LocalDate lastMonthLastFriday = LocalDate.parse("2018-12-01")
                .with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        System.out.println("2018年最后一个星期五：" + lastMonthLastFriday);

        //获取昨天的日期
        LocalDate tomorrow = LocalDate.now().plusDays(-1);
        System.out.println("昨天的日期：" + tomorrow);

        //获取明年的今天
        LocalDate nextYear = LocalDate.now().plusYears(1);
        System.out.println("明年今日：" + nextYear);

    }
}
