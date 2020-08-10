package com.wong.class9;

/**
 * @author wong
 * @date Created in 2020/7/31 21:34
 * @Description: 实现猫类，继承动物类
 * @Version 1.0
 */
public class Cat extends Animal {
    public int claws = 4;
    public String voice = "喵";

    public void play() {
        System.out.println("猫会玩毛线球");
    }

    @Override
    public void drink() {
        System.out.println("猫不爱喝水");
    }

//    @Override
//    public void run() {
//        System.out.println("猫会跑");
//    }

    public void run(String giao) {
        System.out.println("猫会奔跑");

    }
}
