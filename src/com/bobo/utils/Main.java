package com.bobo.utils;


import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by evildoerdb_ on 2018/8/11
 */
public class Main {

    public static void main(String[] args) throws Exception{
        SimpleDateFormat format = new SimpleDateFormat("MM-dd");
        String date = format.format(new Date());
        System.out.println(date);

        System.out.println();

    }
}
