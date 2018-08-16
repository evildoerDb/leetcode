package com.bobo.easy;

/**
 * Created by evildoerDb on 2018/8/16 15:28
 *
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 *
 * Please note that the string does not contain any non-printable characters.
 *
 * Example:
 *
 * Input: "Hello, my name is John"
 * Output: 5
 *
 * 434
 */
public class CountSegments {
    public static int countSegments(String s) {
        int times = 0;
        int length = s.length();
        for (int i =0; i < length; i++){
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')){
                times++;
            }
        }
        return times;
    }

    public static void main(String[] args) {
        String str = "Hello,my name is John";
        System.out.println(countSegments(str));
    }
}
