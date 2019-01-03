package com.itmnms.douyin.demo8;

public class Test4 {
    public static void main(String[] args) {

        //短信信息模板
        String messageModel = "【大猿向前冲】尊敬的用户，您的校验码:%s。如非本人操作，请检查账号安全。";

        String message = String.format(messageModel, "9527");
        System.out.println(message);
    }
}
