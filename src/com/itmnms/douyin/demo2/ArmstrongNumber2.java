package com.itmnms.douyin.demo2;

public class ArmstrongNumber2 {

    //阿姆斯特朗 (艺名：水仙花) 第二种写法
    public static void main(String[] args) {
        //寻找[100, 999]范围内的阿姆斯特朗数字
        //例如： 153 = 1*1*1 + 5*5*5 + 3*3*3

        //模拟百位数
        for (int bai = 1; bai <= 9; bai ++) {
            //模拟十位数
            for (int shi = 0; shi <= 9; shi ++) {
                //模拟个位数
                for (int ge = 0; ge <= 9; ge ++) {

                    //获取当前数字
                    int target = bai * 100 + shi * 10 + ge * 1;

                    //立方和
                    int num = (int)(Math.pow(bai, 3) + Math.pow(shi, 3) + Math.pow(ge, 3));

                    if (num == target) {
                        System.out.println(target);
                    }
                }
            }

        }
    }
}
