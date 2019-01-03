package com.itmnms.douyin.demo8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {

    public static void main(String[] args) {
//        String[] names = {"jack", "pony", "steve"};
//
//        //数组转List
//        List<String> nameList = Arrays.asList(names);



        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("pony");
        list.add("steve");

        //List转数组
        Object[] names = list.toArray();

        for (Object ss : names) {
            System.out.println(ss);
        }

    }
}
