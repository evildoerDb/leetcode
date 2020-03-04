package com.bobo.medium;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 *
 * 示例 1:
 *
 * 输入: 2.00000, 10
 * 输出: 1024.00000
 */
public class MyPow {

    public static double myPow(double x, int n) {
        double result = x;
        for (int i = 1; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.10000,3));
    }
}
