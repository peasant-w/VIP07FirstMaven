package com.wong.class8;

/**
 * @author wong
 * @date Created in 2020/7/29 21:23
 * @Description: 选择排序学习
 * @Version 1.0
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {1, 8, 6, 545, 6, 9, 13, 4, 63, 1, 46, 1, 64, 2, 5, 7456, 4};
        int[] result = selectionSort(a);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] selectionSort(int[] input) {
        for (int i = 1; i <= input.length - 1; i++) {
            int min = input[i - 1];
            int mini = i - 1;
            for (int index = i; index <= input.length - 1; index++) {
                if (input[index] < min) {
                    min = input[index];
                    mini = index;
                }
            }//循环比较晚之后，会找到最小的数和他的位置，也就是input[mini]
            //交换最小的数的位置和当前i-1下标的数的位置
            if (min != input[i - 1]) {
                //如果第i个数不是最小的数，则交换input[mini]和input[i-1]
                input[mini] = input[i - 1];
                input[i - 1] = min;
            }
        }
        return input;
    }
}
