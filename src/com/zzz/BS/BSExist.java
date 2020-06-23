package com.zzz.BS;

/**
 * @program: 算法与数据结构
 * @Author：ZZZ
 * @Date：2020/6/20$ 14:52$
 * @Version: 1.0
 * 1) 在一个有序数组中，找某个数是否存在
 **/
public class BSExist {
    public static boolean exist(int[] sortedArr, int num) {
        if (sortedArr == null || sortedArr.length == 0) {
            return false;
        }
        int L = 0;
        int R = sortedArr.length - 1;
        int mid = 0;
        // L..R
        while (L < R) {
            mid = L + ((R - L) >> 1); // mid = (L + R) / 2当L和R下标过大时，mid会溢出
            if (sortedArr[mid] == num) {
                return true;
            } else if (sortedArr[mid] > num) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return sortedArr[L] == num;
    }
}
