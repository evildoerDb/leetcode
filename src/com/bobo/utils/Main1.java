package com.bobo.utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by evildoerdb_ on 2018/8/25
 *
 * 用0-9的数字随机生成一个长度10亿的字符串，并在此字符串中判断字符串5327826是否出现
 * 结果返回格式
 * 生成随机数耗时：xxx微秒
 *
 * 字符串是否存在：true or false
 */
public class Main1 {

    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        long begin = System.currentTimeMillis();
        long end;

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();
        for (int i = 0 ; i < 1000000000; i++){
            if (queue.size() < 7){
                queue.add(random.nextInt(10));

            }else {
                for (int j = 0 ; j < 7; j++){
                    int value = queue.poll();
                    sb.append(value+"");
                    temp.add(value);
                }
                if (sb.toString().equals("5327826")){
                    end = System.currentTimeMillis();
                    System.out.println("生成随机数耗时："+(end - begin) * 1000+"微秒");
                    System.out.println("判断字符串是否存在耗时："+(end - begin) * 1000+"微秒");
                    System.out.println("字符串是否存在："+true);
                    System.exit(0);
                }
                for (int k = 0 ; k < 7 ; k++){
                    queue.add(temp.poll());
                }
                queue.add(random.nextInt(10));
                queue.poll();
                temp.clear();
                sb.delete(0,sb.length());
            }
        }

        for (int j = 0 ; j < 7; j++){
            int value = queue.poll();
            sb.append(value+"");
            temp.add(value);
        }
        if (sb.toString().equals("5327826")){
            end = System.currentTimeMillis();
            System.out.println("生成随机数耗时："+(end - begin) * 1000+"微秒");
            System.out.println("判断字符串是否存在耗时："+(end - begin) * 1000+"微秒");
            System.out.println("字符串是否存在："+true);
        }else {
            end = System.currentTimeMillis();
            System.out.println("生成随机数耗时："+(end - begin) * 1000+"微秒");
            System.out.println("判断字符串是否存在耗时："+(end - begin) * 1000+"微秒");
            System.out.println("字符串是否存在："+false);
        }

    }


}
