package com.wong.class8;

import java.util.Scanner;

/**
 * @author wong
 * @date Created in 2020/7/29 20:04
 * @Description:
 * @Version
 */
public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮件地址：**");
        String input = sc.nextLine();
        System.out.println(checkMail(input));

    }

    public static boolean checkMail(String input) {
        boolean result = false;
        //邮箱格式 用户名@邮箱服务器域名，一级域名，.com，.cn，.org，.edu
        String emailRegex = "\\w{3,9}@w{2,16}\\.(com|cn|org|edu)";
        if (input.matches(emailRegex)) {
            result = true;
        }
        return result;
    }
}
