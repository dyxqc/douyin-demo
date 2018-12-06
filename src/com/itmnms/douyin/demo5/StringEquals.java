package com.itmnms.douyin.demo5;

import java.util.Stack;

public class StringEquals {
    public static void main(String[] args) {

        //*** String equals()方法答疑 ***

        String s1 = "tom";
        String s2 = "jack";

        System.out.println(s1.equals(s2));//s1和s2比较

        System.out.println(s1.equals(s1));//s1自己和自己比较

        Stack<Integer> numbers = new Stack<>();
        Stack<Character> opts = new Stack<>();

        String m = "(((5+3)*4)-2)*5";
        char[] chars = m.toCharArray();
        for (char c : chars) {
            if ('(' == c) {
                continue;
            }
            if (c >= 48 && c<= 57) {
                //数字栈
                numbers.push(Integer.valueOf(String.valueOf(c)));
            }
            if ('+' == c || '-' == c || '*' == c || '/' == c) {
                opts.push(c);
            }

            if (')' == c) {
                //进行出栈操作
                int num2 = numbers.pop();
                int num1 = numbers.pop();
                char flag = opts.pop();
                StringEquals.jisuan(numbers, flag, num1, num2);
            }
        }

        if (opts.size() > 0) {
            char flag = opts.pop();
            int num2 = numbers.pop();
            int num1 = numbers.pop();
            StringEquals.jisuan(numbers, flag, num1, num2);
        }

        System.out.println("result=" + numbers.pop());


    }

    public static void jisuan(Stack<Integer> numbers, char flag, int num1, int num2) {
        if ('+' == flag) {
            numbers.push(num1 + num2);
        }
        if ('-' == flag) {
            numbers.push(num1 - num2);
        }
        if ('*' == flag) {
            numbers.push(num1 * num2);
        }
        if ('/' == flag) {
            numbers.push(num1 / num2);
        }
    }
}
