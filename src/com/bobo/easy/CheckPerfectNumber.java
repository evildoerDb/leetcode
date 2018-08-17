package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/17 14:29
 *
 * We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
 *
 * Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.
 * Example:
 * Input: 28
 * Output: True
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14
 *
 * 507
 */
public class CheckPerfectNumber {

    public static boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i + num / i;
            }
        }
        return sum == num;
    }
    public static boolean checkPerfectNumber1(int num) {
        switch (num){
            case 6: return true;
            case 28: return true;
            case 496: return true;
            case 8128: return true;
            case 33550336: return true;
            default:return false;

        }
    }

    public static void main(String[] args) {
        for (int i = 0 ; i < 1e8; i++){
            if (checkPerfectNumber(i)){
                System.out.print(i+ " ");
            }
        }
    }
}
