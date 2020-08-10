package com.wong.class10;

/**
 * @author wong
 * @date Created in 2020/8/3 21:19
 * @Description: 接口学习
 * @Version 1.0
 */
public interface Employer {
    //接口中只允许static、final修饰的常量，所以通常变量名直接大写
     String TYPE = "苦逼的上班族";

    /**
     *接口中，只允许存在抽象方法
     */
     void work();

    /**
     * 接口中，可以有默认定义的方法，有default修饰
     */
     default void jiaban() {
        System.out.println("苦逼加班中");
    }

    /**
     * 方法的定义童颜搞得可以自由指定，返回类型，方法名，参数列表
     * @param time 时间
     * @return 返回值
     */
     String moYu(int time);

    /**
     * java1.8之后，接口中可以有静态方法，且需要方法体
     */
    static void drink(){
        System.out.println("社畜每小时一杯水");
    }
}
