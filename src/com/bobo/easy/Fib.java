package com.bobo.easy;

/**
 * @author Boild
 * @date 2020-03-04
 *
 *
 */
public class Fib {

    private static int fib(int n) {

        if (n < 2) {
            return n;
        } else {

            int first = 0;
            int second = 1;

            int value = 0;
            for (int i = 2; i <= n; i++) {
                value = first + second;
                if (value >= 1000000007) {
                    value -= 1000000007;
                }
                first = second;
                second = value;
            }
            return value;
        }

    }

    public static void main(String[] args) {
        System.out.println(fib(2));
    }
}
