package com.bobo.sorted;

import com.bobo.utils.ArrayUtils;

/**
 * Created by evildoerdb_ on 2018/8/5
 *
 * 堆排
 *
 * 父节点是 （i -1 ） / 2
 *
 * 左节点是 2 * i +1   有节点是 2 * i + 2
 *
 * 算法上的堆是完全二叉树
 *
 * 大根堆  父节点是整个子树种的最大值
 *
 */
public class HeapSort {

    public static void heapSort(int [] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        //建立大根堆 每个节点是整个子树中的最大值
        for (int i = 0 ; i < arr.length ; i++){
            heapInsert(arr,i);
        }

        int size = arr.length;
        swap(arr,0,--size);
        while (size > 0){
            heapify(arr,0,size);
            swap(arr,0,--size);
        }
    }

    /**
     * 下沉的过程
     * @param arr
     * @param index
     * @param size
     */
    private static void heapify(int[] arr, int index, int size) {
        int left = index * 2 +1;
        while (left < size){

            //如果左右孩子都存在 选最大的  作为largest
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left +1 : left;
            //largest变为 自己和左右孩子中最大的值
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index){
                break;
            }
            swap(arr,largest,index);
            index = largest;
            left = index * 2 +1;
        }

    }

    /**
     * 从index位置开始进行与父节点的比较 直到不比父节点大 或者到0的位置停止
     * @param arr
     * @param index
     */
    private static void heapInsert(int[] arr, int index) {

        while (arr[index] > arr[(index - 1 ) / 2]){
            swap(arr,index,(index -1 ) / 2 );
            index = (index -1 ) / 2;
        }
    }



    private static void swap(int[] arr, int j, int i) {

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = ArrayUtils.getArray(10,20);
        ArrayUtils.printArray(arr);
        heapSort(arr);
        System.out.println();
        ArrayUtils.printArray(arr);
    }

}
