package com.wong.class9;

/**
 * @author wong
 * @date Created in 2020/7/31 21:31
 * @Description: 继承学习
 * @Version 1.0
 */
public class Animal {
    int eyes = 2;
    int nose = 1;
    String type = "动物";

    public Animal() {
        System.out.println("动物出生了");
    }

    public void drink() {
        System.out.println("动物都会喝水");
    }

    public void run() {
        System.out.println("动物都能跑");
    }

    public void getEyes() {
        System.out.println(this.eyes);
    }
}
