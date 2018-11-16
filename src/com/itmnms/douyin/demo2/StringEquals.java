package com.itmnms.douyin.demo2;

public class StringEquals {

    public static void main(String[] args) {

        //字符串的比较

        String name1 = "tom";
        String name2 = "tom";
        System.out.println(name1 == name2);

        String name3 = new String("tom");
        String name4 = new String("tom");
        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));
        //给你三秒钟 思考...

        //所以最终的结果是：true false true 你看明白了麽...
        //结论：字符串比较一定要使用equals方法，切记！
    }
}
