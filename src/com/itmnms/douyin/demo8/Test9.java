package com.itmnms.douyin.demo8;

import java.util.Arrays;
import java.util.List;

public class Test9 {

    public static void main(String[] args) {
        String[] names = {"jack", "pony", "steve"};

        //数组转List
        List<String> nameList = Arrays.asList(names);

        nameList.add("大猿向前冲");
    }
}
