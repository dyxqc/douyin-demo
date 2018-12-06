package com.itmnms.douyin.demo6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoopMap {
    public static void main(String[] args) {
        // ***** Java面试题：Map集合的遍历方式 *****
        Map<String, String> map = new HashMap<>();
        map.put("a", "jack");
        map.put("b", "pony");
        map.put("c", "steve");

        //case1: 通过keySet遍历
        for (String key : map.keySet()) {
            System.out.println(key + "-" + map.get(key));
        }

        System.out.println("----------------");

        //case2: 通过Iterator遍历
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("----------------");

        //case3: 通过entrySet遍历
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("----------------");

        //case4: 通过lambda表达式遍历
        map.forEach((k , v) -> System.out.println(k + "-" + v));

        //划重点：推荐第3和第4种方式 也就是entrySet和lambda方式
    }
}
