package com.bobo.utils;

import java.util.Random;

/**
 * Created by evildoerDb on 2018/7/25 14:40
 *
 * 对数器
 */
public class ArrayUtils {

    /**
     * 获取一个随机的整形数组
     * @param length 数组长度
     * @param range  数组值的范围
     * @return
     */
    public static int [] getArray(int length,int range){
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0 ; i < length; i++){
            arr[i] = random.nextInt(range);
        }

        return arr;
    }


    /**
     * 打印数组
     * @param arr
     */
    public static void printArray(int [] arr){

        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    /**
     * 判断两个数组是否完全相等
     * @param arr1
     * @param arr2
     * @return
     */
    public static boolean isEquals(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * 交换两个数组
     * @param num1
     * @param num2
     */
    public void swap(int num1, int num2){
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
    }
}
