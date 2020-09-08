package com.zzz.EOR;

/**
 * @program: 算法与数据结构
 * @Author：ZZZ
 * @Date：2020/6/20$ 15:24$
 * @Version: 1.0
 * 题目一：如何不用额外变量交换两个数
 **/
public class Eor1 {
    public static void main(String[] args) {
        int a = 6;
        int b = -1000;


        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


        System.out.println(a);
        System.out.println(b);


        int[] arr = {3, 1, 100};

        System.out.println(arr[0]);
        System.out.println(arr[2]);

        swap(arr, 0, 0);

        System.out.println(arr[0]);
        System.out.println(arr[2]);

    }


    public static void swap(int[] arr, int i, int j) {
        // arr[0] = arr[0] ^ arr[0];
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
