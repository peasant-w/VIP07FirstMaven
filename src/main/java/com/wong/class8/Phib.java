package com.wong.class8;

/**
 * @author wong
 * @date Created in 2020/7/29 22:28
 * @Description: 斐波那契数列学习
 * @Version 1.0
 */
public class Phib {
    public static void main(String[] args) {
        System.out.println(phib(13));
        System.out.println(phibArray(13));
    }

    /**
     * 通过递归方式实现斐波那契数列计算
     *
     * @param n 项值
     * @return result 结算结果
     */
    public static int phib(int n) {
        int result;
        if (n == 1) {
            result = 0;
        } else if (n == 2) {
            result = 1;
        } else {
            result = phib(n - 2) + phib(n - 1);
        }
        return result;
    }

    /**
     * 通过数组方式实现斐波那契数列计算
     *
     * @param n 项值
     * @return a[n-1] 计算结果
     */
    public static int phibArray(int n) {
        int[] a = new int[n];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n - 1];
    }
}
