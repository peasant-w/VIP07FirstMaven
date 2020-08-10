package com.wong.class7;

/**
 * @author wong
 * @date Created in 2020/7/27 20:13
 * @Description: 正则表达式学习
 * @Version 1.0
 */
public class RegexLearn {
    public static void main(String[] args) {
        String java = "1546念成dfa";
        String python="python编程";
        //定义一个正则表达式，用于表述xx编程
        String programmingRegex = "(python)?.*";
        System.out.println(java.matches(programmingRegex));
    }
}
