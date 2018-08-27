package com.bobo.utils;

/**
 * Created by evildoerdb_ on 2018/8/25
 *
 *
 * 有一对刚出生的兔子，生长到第三个月。开始生第一对兔子，并且以后每月生一对兔子（刚好一雄一雌，刚好配对，不存在隔代乱伦），
 * 小兔子生长到第三个月，也开始生兔子，满2年这对兔子失去生育能力，满3年这对兔子死亡，分别求满5年、满10年有多少只兔子。
 * 结果返回格式
 * 5年后兔子数量：xxx
 * 10年后兔子数量：xxx
 */
public class Main3 {

    public static void main(String[] args) {

        System.out.println("5年后兔子数量："+ getTotal(60));
        System.out.println("10年后兔子数量："+ getTotal(120));


        System.out.println(fib(60));

    }

    public static long getTotal(int month){
        long total = fib(month);
        if (month <= 24){
            return total;
        }
        long sum =0;

        for (int i = 1 ; i <= month - 22; i ++){
            sum += fib(i);
        }

        if (month <= 36){
            return total - sum;
        }

        long die =0;
        for (int i = 1 ; i <= month - 36; i++){
            die += i;
        }

        return total - sum - die;
    }
    public static long fib(int n){
        if (n <= 2){
            return 1;
        }
        long first = 1;
        long second = 1;
        long result = 0;
        for (int i = 3; i <= n; i++){
            result = first + second;
            second = first;
            first = result;
        }
        return result;
    }


}
