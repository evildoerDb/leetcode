package com.bobo.refers_to_offer;

/**
 * @author Boild
 * @date 2020-05-19
 */
public class Add {

    /**
     * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
     * @param num1
     * @param num2
     * @return
     */
    public int Add(int num1,int num2) {
        int num3 = num1 ^ num2;
        int num4 = (num1&num2)<<1;
        if(num4==0)
            return num3;
        return Add(num3,num4);
    }
}
