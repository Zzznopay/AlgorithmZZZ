package com.zzz.EOR;

/**
 * @program: 算法与数据结构
 * @Author：ZZZ
 * @Date：2020/6/20$ 15:29$
 * @Version: 1.0
 * 题目二：一个数组中有一种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这种数
 * 题目四：一个数组中有两种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这两种数
 **/
public class EvenTimesOddTimes {

    // arr中，只有一种数，出现奇数次
    public static void printOddTimesNum1(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        System.out.println(eor);
    }

    // arr中，有两种数，出现奇数次
    public static void printOddTimesNum2(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        // eor = a ^ b
        // eor != 0
        // eor必然有一个位置上是1
        int rightOne = eor & (~eor + 1); // 提取出最右的1
        int onlyOne = 0; // eor'
        for (int i = 0 ; i < arr.length;i++) {
            if ((arr[i] & rightOne) != 0) {
                onlyOne ^= arr[i];
            }
        }
        System.out.println(onlyOne + " " + (eor ^ onlyOne));
    }

    //计算N值二进制有多少个1
    public static  int bytecount(int N){
        int count = 0;

        while (N != 0){
            int rightOne = N & ((~N) + 1);
            count++;
            N ^= rightOne;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);

        int[] arr1 = { 3, 3, 2, 3, 1, 1, 1, 3, 1, 1, 1 };
        printOddTimesNum1(arr1);

        int[] arr2 = { 4, 3, 4, 2, 2, 2, 4, 1, 1, 1, 3, 3, 1, 1, 1, 4, 2, 2 };
        printOddTimesNum2(arr2);

    }
}
