package com.bobo.medium;

/**
 * Created by evildoerDb on 2018/7/18 16:09
 *
 * 给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）。
 *
 * 示例 1:
 *
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 * 示例 2:
 *
 * 输入: [-2,0,-1]
 * 输出: 0
 * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 */
public class MaxProduct {


    public static void main(String[] args) {
        int [] arr =  {2,3,-2,4};
        int max = myMaxProduct(arr);
        System.out.println(max);
    }

    /**
     * O(n2)的时间复杂度  暴力解法
     * @param nums
     * @return
     */
    public static int maxProduct(int[] nums) {

        if (nums.length == 1){
            return nums[0];
        }
        int max = nums[0];
        int current = max;
        for (int i = 0 ; i < nums.length -1 ; i++){
            current = nums[i];
            for (int j = i +1 ; j < nums.length ; j++){
                current *= nums[j];
                max = current > max ? current : max;
                max = nums[j] > max ? nums[j] : max;
            }

        }

        return max;
    }


    /**
     * 网上最优解  时间复杂度O(n)
     * @param A
     * @return
     */
    public int maxProduct1(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int maxherepre = A[0];
        int minherepre = A[0];
        int maxsofar = A[0];
        int maxhere, minhere;

        for (int i = 1; i < A.length; i++) {
            maxhere = Math.max(Math.max(maxherepre * A[i], minherepre * A[i]), A[i]);
            minhere = Math.min(Math.min(maxherepre * A[i], minherepre * A[i]), A[i]);
            maxsofar = Math.max(maxhere, maxsofar);
            maxherepre = maxhere;
            minherepre = minhere;
        }
        return maxsofar;
    }

    /**
     * 在阅读了网上给出的最优解的代码后 自己实现
     * 典型的dp问题
     * @param arr
     * @return
     */
    public static int myMaxProduct(int [] arr){
        if (arr.length == 0){
            return 0;
        }
        int max = arr[0];
        //当前的索引前面的所有的最大值
        int maxPre = arr[0];
        //当前的索引前面的所有的最小值 主要是为了找出负数
        int minPre = arr[0];
        int maxNow;//当前位置的最大值
        int minNow;//当前位置的最小值
        for (int i = 1; i < arr.length ; i++){
            //找出当前位置、当前位置*以前的最大值、当前位置*以前的最小值中的最大值
            maxNow = Math.max(Math.max(maxPre * arr[i], minPre * arr[i]),arr[i]);
            //找出当前位置、当前位置*以前的最大值、当前位置*以前的最小值中的最小值
            minNow = Math.min(Math.min(maxPre * arr[i], minPre * arr[i]),arr[i]);
            //最大值是以前的最大值和截止当前位置的最大值
            max = Math.max(maxNow,max);
            //进行下一步遍历的准备  将目前最大/小值赋值给以前的最大/小值
            maxPre = maxNow;
            minPre = minNow;
        }


        return max;
    }
}
