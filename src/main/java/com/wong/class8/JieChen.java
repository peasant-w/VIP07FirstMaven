package com.wong.class8;

/**
 * @author wong
 * @date Created in 2020/7/29 22:23
 * @Description: 计算n的阶乘
 * @Version 1.0
 */
public class JieChen {
    public static void main(String[] args) {
        System.out.println(jieCheng(10));
    }

    public static int jieCheng(int n) {
        int result;
        if (n == 1) {
            result = 1;
        } else {
            result = n * jieCheng(n - 1);
        }
        return result;
    }
}
