package com.wong.class10;

/**
 * @author wong
 * @date Created in 2020/8/3 20:56
 * @Description: 抽象类学习
 * @Version 1.0
 */
public abstract class AbstractC{
    String kind ="抽象";
    public void sound(){
        System.out.println("我是抽象类中的具体实现方法");
    }
    public abstract void silent();
}
