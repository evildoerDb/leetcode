package com.bobo.easy;

/**
 * @author Boild
 * @date 2020-03-08
 */
public class Reverse {

    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * @param x
     * @return
     */
    public static int reverse(int x) {
        String str = String.valueOf(x);

        StringBuilder sb = new StringBuilder();
        if (x >= 0) {
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
        } else {
            sb.append("-");
            for (int i = str.length() - 1; i > 0; i--) {
                sb.append(str.charAt(i));
            }

        }

        try {
            return Integer.valueOf(sb.toString());
        } catch (Exception e) {
            return 0;
        }



    }

    public static int reverse2(int x) {

        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x /= 10;
        }

        return n > Integer.MAX_VALUE || n < Integer.MIN_VALUE ? 0 : (int) n;
    }

    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse2(x));

    }
}
