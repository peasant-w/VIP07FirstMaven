package com.wong.class10;

/**
 * @author wong
 * @date Created in 2020/8/3 21:30
 * @Description: 社畜类接口实现
 * @Version 1.0
 */
public class EmployerImpl implements Employer {
    @Override
    public void work() {
        System.out.println("开发");
    }

    @Override
    public String moYu(int time) {
        System.out.println("开发今天通过带薪拉屎摸鱼" + time + "小时");
        String mood;
        int i = 3;
        if (time > i) {
            System.out.println("开发今天摸鱼" + time + "小时,非常高兴");
            mood="nice";
        } else {
            System.out.println("摸鱼时间不够，不是很高心");
            mood="bad";
        }
        return mood;
    }
    @Override
    public void jiaban(){
         System.out.println("007加班中");
    }
}
