package com.bobo.sorted;

/**
 * Created by evildoerdb_ on 2018/8/4
 *
 * 插入排序
 */
public class InsertSort {

    public static void insertSort(int [] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i =1 ; i < arr.length ; i++){
            for (int j = i -1 ; j >=0 && arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {9,3,5,2,6,2,1};
        insertSort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

}
