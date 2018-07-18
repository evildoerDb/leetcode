package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/7/18 15:52
 *
 * 判断是否为回文数字
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class IsPalindrome {

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            if(ch[i] != ch[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}
