package com.bobo.utils;

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
        int [] arr = new int[length];

        for (int i = 0 ; i < length; i++){
            arr[i] = (int)(Math.random() * range);
        }

        return arr;
    }
}
