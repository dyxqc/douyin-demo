package com.itmnms.douyin.demo6;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestException {

    // ***** 关闭流的正确姿势 *****

    // 让人呕吐的IO流操作 这心累
    public void a() {
        FileOutputStream fos = null;
        try {

            fos = new FileOutputStream("/xx.txt");
            fos.write("hello world".getBytes());
            fos.flush();
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {}
            }
        }
    }

    // JDK7出现了 关闭流的语法糖 一个字：酸爽 "墙裂"推荐
    public void b() {
        try (FileOutputStream fos =
                     new FileOutputStream("/xx.txt")) {
            fos.write("hello world".getBytes());
            fos.flush();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
