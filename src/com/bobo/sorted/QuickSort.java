package com.bobo.sorted;

/**
 * Created by evildoerdb_ on 2018/8/4
 *
 * 快排
 */
public class QuickSort {

    /**
     * 递归 进行排序
     * @param arr
     * @param l
     * @param r
     */
    public static void quickSort(int [] arr , int l, int r){
        if (l < r){
            swap(arr,l + ((r - l ) >>> 1),r);
            int [] p = partition(arr,l,r);

            //等于区域的左边界递归
            quickSort(arr,l,p[0] -1);

            //等于区域的右边界递归
            quickSort(arr,p[1]+1,r);
        }
    }

    /**
     * 划分数组的partition过程  时间复杂度为O(n)  返回的为等于区域的左右边界
     * @param arr
     * @param l
     * @param r
     * @return
     */
    private static int[] partition(int[] arr, int l, int r) {

        int less  = l - 1;
        int more = r;
        while (l < more){
            if (arr[l] < arr[r]){
                swap(arr, ++less, l++);
            }else if (arr[l] > arr[r]){
                swap(arr,--more, l);
            }else {
                l++;
            }
        }
        swap(arr,more,r);
        return new int [] {less +1 ,more};
    }


    private static void swap(int[] arr, int j, int i) {

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4,51,1,5,62,14,5,32,6};
        quickSort(arr,0,arr.length-1);

        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
