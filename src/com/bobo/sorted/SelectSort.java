package com.bobo.sorted;

/**
 * Created by evildoerdb_ on 2018/8/4
 *
 * 选择排序
 */
public class SelectSort {

    public static void selectSort(int [] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }
    private static void swap(int[] arr, int j, int i) {

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {9,3,5,2,6,2,1};
        selectSort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
