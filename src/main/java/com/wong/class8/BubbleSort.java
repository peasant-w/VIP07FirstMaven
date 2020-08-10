package com.wong.class8;

/**
 * @author wong
 * @date Created in 2020/7/29 20:59
 * @Description: 冒泡排序学习
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1, 8, 6, 545, 6, 9, 13, 4, 63, 1, 46, 1, 64, 2, 5, 7456, 4};
        int[] result = bubbleSort(a, true);
        for (int j : result) {
            System.out.print(j + " ");
        }


    }

    /**
     * 冒泡排序
     *
     * @param input 目标数组
     * @param desc  正序倒序开关
     * @return 冒泡排序后的数组
     */
    public static int[] bubbleSort(int[] input, boolean desc) {
        for (int i = 1; i <= input.length - 1; i++) {
            for (int index = 0; index <= input.length - 1 - i; index++) {
                if (desc) {
                    if (input[index] > input[index + 1]) {
                        int tmp = input[index];
                        input[index] = input[index + 1];
                        input[index + 1] = tmp;
                    }
                } else {
                    if (input[index] < input[index + 1]) {
                        int tmp = input[index];
                        input[index] = input[index + 1];
                        input[index + 1] = tmp;
                    }
                }
            }
        }
        return input;
    }
}
