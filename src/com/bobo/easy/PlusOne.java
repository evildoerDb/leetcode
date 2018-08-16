package com.bobo.easy;

import java.util.Arrays;

/**
 * Created by evildoerDb on 2018/8/16 15:01
 *
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 * 66
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {
       if (digits[digits.length -1] == 9){
           int cn =1;
           for (int i = digits.length -1; i >= 0; i--){
               if (cn ==1){
                   cn = (digits[i] + cn) == 10 ? 1 :0;
                  if (digits[i] == 9){
                      digits[i] = 0;
                  }else {
                      digits[i]++;
                  }
               }else {
                   return digits;
               }
           }
           if (cn == 1){
               int [] newArr = new int[digits.length +1];
               newArr[0] =1;
               for (int i = 0; i <digits.length;i++ ){
                   newArr[i+1] = digits[i];
               }
               return newArr;
           }
           return digits;
       }else {
           digits[digits.length-1]++;
           return digits;
       }

    }

    public static void main(String[] args) {
        int[] arr = {1,9,9};
        int[] newArr = plusOne(arr);
        for (int i : newArr){
            System.out.print(i + "　");
        }
    }

}
