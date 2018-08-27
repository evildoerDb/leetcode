package com.bobo.utils;

/**
 * Created by evildoerdb_ on 2018/8/25
 *
 * 计算1-N之间所有的正整数中包含的1的数量，本题需返回当N=37685531时的结果
 * 结果返回格式
 * 1的数量：XXX
 */
public class Main {

    public static void digitOne(int n ){
        if (n <= 0) {
            System.out.println("1的数量：" + 0);
        }
        int temp = n;
        int base = 1;
        int result = 0;

        while (temp > 0){
            int digit = temp % 10;
            temp /= 10;
            result += temp * base;
            if (digit == 1){
                result += n % base + 1;

            }
            if (digit >  1){
                result += base;
            }
            base *= 10;
        }
//        return result;
        System.out.println("1的数量：" + result);
    }

    public static void main(String[] args) {
        int num = 37685531;
        digitOne(num);

    }




}
