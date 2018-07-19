package com.bobo.easy;

/**
 * Created by evildoerdb_ on 2018/7/19
 *
 *
 * 我们把符合下列属性的数组 A 称作山脉：
 *
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 */
public class PeakIndexInMountainArray {

    public static int peakIndexInMountainArray(int[] A) {
        int index = 0;
        int max = A[0];
        for (int i = 1 ; i< A.length ; i++){
            if (max < A[i]){
                max = A[i];
                index =i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,0};
        int index = peakIndexInMountainArray(arr);
        System.out.println(index);

    }
}
