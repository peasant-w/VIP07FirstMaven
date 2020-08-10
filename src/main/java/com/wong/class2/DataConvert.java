package com.wong.class2;

public class DataConvert {
    public static void main(String[] args) {
        int a = 16;
        byte b = 9;
        //int精度更高，所以结果是int类型
        int c = a * b;
        byte d = (byte) (a * b);
        System.out.println("c的结果是" + c + "    d的结果是" + d);
        System.out.println();
        //144的int存储32位 0000 0000 0000 0000 0000 0000 1001 0000
        //转为byte类型，只有8位，1001 0000 ->反码 0110 1111 64+32+8+4+2+1=111+1=112
        //添加负号-112
    }
}
