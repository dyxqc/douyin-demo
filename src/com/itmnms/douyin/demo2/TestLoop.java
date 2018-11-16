package com.itmnms.douyin.demo2;

public class TestLoop {

    public static void main(String[] args) {

        //如何正确的退出外层循环？

        outter:
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {

                //当外层i=1时，停止所有的循环
                if (i == 1) {
                    break outter;
                }

                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
