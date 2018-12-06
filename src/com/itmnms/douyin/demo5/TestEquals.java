package com.itmnms.douyin.demo5;

public class TestEquals {

    public static void main(String[] args) {
        //经典面试题：谈谈你对equals()和hashCode()方法的理解

        String s1 = new String("abc");
        String s2 = new String("abc1");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
    }
}
