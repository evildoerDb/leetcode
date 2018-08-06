package com.bobo.sorted;

/**
 * Created by evildoerdb_ on 2018/8/4
 *
 * 选择排序
 */
public class SelectSort {

    public static void selectSort(int [] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = 0 ; i < arr.length -1 ; i++){
            int minIndex = i;
            for (int j = i+1; j < arr.length;j++){
                minIndex = arr[minIndex] > arr[j] ? j : minIndex;
            }
            swap(arr,i,minIndex);
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
