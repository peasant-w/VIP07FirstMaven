package com.wong.class5;

/**
 * @author wong
 * @Description: Dog class
 * @date Created in 2020/7/22 20:23
 * @Version 1.0
 */
public class Dog {
    public int age = 0;
    public String dogName;
    public static final String LITTLE_DOG_BARK = "呜呜";
    public static final String BIG_DOG_BARK = "汪汪";
    public static final String OLD_DOG_BARK = "嗷嗷";

    /**
     * 构造方法重写，传入参数name
     *
     * @param name 名字
     */
    public Dog(String name) {
        this.dogName = name;
        this.age = this.age + 1;
    }
}
