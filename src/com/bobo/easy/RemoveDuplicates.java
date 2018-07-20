package com.bobo.easy;

/**
 * Created by evildoerdb_ on 2018/7/19
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 26
 */
public class RemoveDuplicates {

    /**
     * 用两根指针
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i = 1 ; i < nums.length ;i++){
            if (nums[index] != nums[i] ){
                nums[++index] = nums[i];
            }
        }
        return index + 1;

    }

    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates(arr);
        System.out.println(length);
    }
}
