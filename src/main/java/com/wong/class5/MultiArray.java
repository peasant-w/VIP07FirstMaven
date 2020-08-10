package com.wong.class5;


/**
 * @author wong
 * @date Created in 2020/7/22 21:49
 * @Description: 多维数组学习
 * @Version 1.0
 */
public class MultiArray {
    public static void main(String[] args) {
        String[][] a = new String[9][9];
        for (int i = 1; i <= a.length; i++) {
            for (int j = 1; j <= i; j++) {
                a[i - 1][j - 1] = j + "*" + i + "=" + i * j + "\t";
            }
        }
        for (String[] i : a) {
            for (String j : i) {
                if (j != null) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
