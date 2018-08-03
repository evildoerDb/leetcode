package com.bobo.hard;

/**
 * Created by evildoerDb on 2018/8/2 15:43
 */
public class RefrenceTest {

    private Object object = null;

    byte [] bytes = new byte[1024 * 1024];

    public static void main(String[] args) {

        RefrenceTest r1 = new RefrenceTest();
        RefrenceTest r2 = new RefrenceTest();
        r1.object = r2;
        r2.object = r1;

        r1 = null;
        r2 = null;

        System.gc();
    }


}
