package com.itmnms.douyin.demo5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReg {

    public static void main(String[] args) {
        String msg = "<script>var s_account = \"timecom\";</script>\n" +
                "<script defer src='http://img.timeinc.net/tii/omniture/h/config/time_s_code_multivideo.js'></script>\n" +
                "<img src=\"http://baidu.com\"><div class=\"pushdowns\">df<img src=\"http://taobao.com\">jkjkdf";

        String reg = "[<img]{1}src=\"(\\W)";

        String a="love23next234csdn3423javaeye";
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(a);
       // System.out.println( m.replaceAll("").trim());
        while (m.find()) {
            System.out.println(m.group());
        }

    }
}
