package com.wong.class3;

/**
 * @author wong
 * @Description: while循环语句学习类
 * @date Created in 2020/7/17 21:56
 * @Version 1.0
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        do {
            System.out.println("=======:"+i);
            i++;
        } while (i <= 200);
    }
}
