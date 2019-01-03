package com.itmnms.douyin.demo8;

import java.util.ArrayList;
import java.util.List;

public class Test8 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("pony");
        list.add("steve");

        //List转数组
//        Object[] names = list.toArray();

        String[] names = new String[3];
        list.toArray(names);

        for (Object ss : names) {
            System.out.println(ss);
        }
    }
}
