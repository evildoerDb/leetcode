package com.bobo.sorted;

import java.util.Stack;

/**
 * Created by evildoerdb_ on 2018/8/4
 *
 * 冒泡排序
 */
public class BubbleSorted {

    public static void bubbleSort(int [] arr){
        for (int i = arr.length -1;i >0 ; i--){
            for (int j = 0 ; j < i ;j++){
                if (arr[j]> arr[j+1]){
                    swap(arr,j,j+1);
                }
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
       bubbleSort(arr);
       for (int i : arr){
           System.out.print(i + " ");
       }
    }
}
