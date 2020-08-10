package com.wong.class3;

/**
 * @author wong
 * @Description: 高斯算数实现
 * @date Created in 2020/7/17 22:35
 * @Version 1.0
 */
public class GauseTest {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
        int j = 1, sumj = 0;
        for (j = 1; j <= 100; j++) {
            sumj += j;
        }
        System.out.println(sumj);
    }
}
