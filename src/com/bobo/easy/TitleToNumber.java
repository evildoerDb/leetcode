package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/10 14:40
 */
public class TitleToNumber {

    public static int titleToNumber(String s) {
        int result = 0;
        for(int i = 0 ; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }

    public static int titleToNumber1(String s) {
        int result = 0;
        for(int i = s.length() -1 ; i >= 0; i--) {
            result = result + (int)Math.pow(26,s.length() - i -1) * (s.charAt(i) - 'A' +1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber1("AB"));
    }

}
