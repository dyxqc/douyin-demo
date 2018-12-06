package com.itmnms.douyin.demo5;

public class TestFinally {
    public static void main(String[] args) {
        //笔试题：finally关键字

//        try {
//            int i = 2 / 0;//故意制造异常
//
//            System.out.println("try...");
//            return;//返回
//        } catch (Exception e) {
//            System.out.println("catch...");
//            return;//返回
//        } finally {
//            System.out.println("finally...");
//        }

        String s = "jjkk7yutrss89mnnmmvbs";

        char[] chars = s.toCharArray();
        int[] counts = new int[255];

        for (int i=0; i<chars.length; i++) {
            counts[(int)chars[i]] += 1;
        }

        for (int i=0; i<counts.length; i++) {
            if (counts[i] <= 0) {
                continue;
            }
            System.out.print(String.valueOf(String.valueOf((char)(i)) + "(" + counts[i] + ") "));
        }



    }
}
