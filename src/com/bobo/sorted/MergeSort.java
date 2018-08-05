package com.bobo.sorted;

import com.bobo.utils.ArrayUtils;

/**
 * Created by evildoerdb_ on 2018/8/5
 *
 * 先做部分排好  再右部分排好 然后排好的一起merge
 *
 * 归并排序
 */
public class MergeSort {

    public static void mergeSort(int [] arr){
        if (arr.length < 2 || arr == null){
            return;
        }
        mergeSort(arr,0, arr.length -1);

    }

    private static void mergeSort(int[] arr, int l, int r) {

        if (l == r){
            return;
        }
        int mid = l +((r - l ) >>> 1);
        mergeSort(arr,l,mid);
        mergeSort(arr,mid +1 , r);
        merge(arr,l,mid,r);

    }

    /**
     * 合并 l 到 r上以 mid 为划分点的两部分的元素
     * @param arr
     * @param l
     * @param mid
     * @param r
     */
    private static void merge(int[] arr, int l, int mid, int r) {
        int [] help = new int[r - l + 1];
        int i = 0 ;
        int p1 = l;
        int p2 = mid +1;
        while (p1 <= mid && p2 <=r){
            help[i++] = arr[p1] <  arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid){
            help[i++] = arr[p1++];
        }
        while (p2 <= r){
            help[i++] = arr[p2++];
        }
        for (i = 0 ; i < help.length ; i++){
            arr[l + i] = help[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtils.getArray(10,20);
        ArrayUtils.printArray(arr);
        mergeSort(arr,0,arr.length -1);
        System.out.println();
        ArrayUtils.printArray(arr);
    }
}
