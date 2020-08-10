package com.wong.class3;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x的值：");
        int x = sc.nextInt();
        if (x > 5 && x << 8 - 7 > 20 || !(x++ < 15)) {
            System.out.println("x的值满足条件");
        }
        System.out.println("if语句执行完");
        if (x > 9) {
            System.out.println("踢球去");
        } else if (x > 4) {
            System.out.println("团建去");
        } else if (x > 0) {
            System.out.println("打篮球去");
        } else {
            System.out.println("人数不能是负数，自由活动吧");
        }
        System.out.println("多人运动结束");
    }
}
