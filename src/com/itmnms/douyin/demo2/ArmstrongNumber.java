package com.itmnms.douyin.demo2;

public class ArmstrongNumber {

    public static void main(String[] args) {
        //寻找[100, 999]范围内的阿姆斯特郎数字
        //例如： 153 = 1*1*1 + 5*5*5 + 3*3*3

        for (int i = 100; i <= 999; i ++) {
            int ge = (i / 1) % 10; // 和10取模得到个位数
            int shi = (i / 10) % 10; //获取十位上的数字
            int bai = i / 100; //获取百位上的数字 如果除不尽则将小数舍去，取其整数。

            int num = ge * ge * ge + shi * shi * shi + bai * bai * bai;
            if (i == num) {
                System.out.println(num);
            }
        }
    }
}
