package com.bobo.hard;


/**
 * Created by evildoerDb on 2018/8/2 15:14
 */
public class RuntimePollOOM {

    public static void main(String[] args) {
        String s1 = new StringBuilder("ja").append("va").toString();
        System.out.println(s1.intern() == s1);

        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2.intern() == s2);
    }
}
