package com.wong.class9;

import java.util.Arrays;

/**
 * @author wong
 * @date Created in 2020/7/31 20:31
 * @Description: 快速排序学习,使用递归的方法
 * @Version 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        int [] a ={1,5,4,5,6,789,5642312,555,437,311756};
        int [] result = quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] quickSort(int[] input, int low, int high) {
        int left = low;
        int right = high;
        int base = input[left];
        while (left < right) {
            while (left < right) {
                if (input[right] < base) {
                    right--;
                } else {
                    int tmp = input[left];
                    input[left] = input[right];
                    input[right] = tmp;
                    left++;
                    break;
                }
            }
            while (left < right) {
                if (input[left] < base) {
                    left++;
                } else {
                    int tmp = input[left];
                    input[left] = input[right];
                    input[right] = tmp;
                    right--;
                    break;
                }
            }
        }
        if (low >= left - 1) {

        } else {
            quickSort(input, low, left - 1);
        }
        if (right + 1 >= high) {
            quickSort(input, right + 1, high);
        }
        return input;
    }
}
