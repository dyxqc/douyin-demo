package com.itmnms.douyin.demo5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComparable {

    public static void main(String[] args) throws Exception {

        //******** 面试题：时间如何比较先后？*********

        Date currDate = new Date();//当前时间 2018-11-23

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date hostoryDate = sdf.parse("2018-10-15");

        System.out.println(currDate.after(hostoryDate));
        System.out.println(hostoryDate.before(currDate));

        // --------before----------|------------after------------>时间轴
        // 灰色的过去         现在          迷茫的未来

    }
}
