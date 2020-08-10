package com.wong.class5;

import java.util.Arrays;

/**
 * @author wong
 * @date Created in 2020/7/22 21:27
 * @Description: 一维数组学习
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        int [] a = new int[9];
        a[0] = 15;
        a[1] = 25;
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        a[1] =5;
        for(int j:a){
            System.out.print(j+" ");
        }
        System.out.println();
        Arrays.fill(a,5);
        for(int k:a){
            System.out.print(k+" ");
        }
    }
}
