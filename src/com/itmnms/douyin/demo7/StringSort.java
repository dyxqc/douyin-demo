package com.itmnms.douyin.demo7;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {

    public static void main(String[] args) {
        String[] msg = {"b", "a", "c", "g", "f", "e"};
        Arrays.sort(msg, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Arrays.asList(msg).forEach(x -> System.out.println(x));
    }
}
