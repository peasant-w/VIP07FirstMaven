package com.wong.class3;

/**
 * @author wong
 * @Description: continue关键字学习，作用是跳出本次循环
 * @date Created in 2020/7/17 22:25
 * @Version 1.0
 */
public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i + 1);
        }
    }
}
