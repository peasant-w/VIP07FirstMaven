package com.wong.class10;

/**
 * @author wong
 * @date Created in 2020/8/3 21:05
 * @Description: 抽象类测试
 * @Version 1.0
 */
public class AbstractCTest {
    public static void main(String[] args) {
        AbstractC ab = new AbstractC() {
            @Override
            public void silent() {
                System.out.println("我是个会说话的抽象方法");
            }
        };
        ab.silent();
        ab.sound();
    }
}
