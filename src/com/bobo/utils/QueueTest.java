package com.bobo.utils;


/**
 * Created by evildoerDb on 2018/8/6 14:23
 *
 * 队列测试
 */
public class QueueTest {

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();
        queue.addFirst(1);
        queue.addFirst(2);
        queue.addFirst(3);

        queue.addLast(4);
        queue.addLast(5);
        queue.addLast(6);

        while (!queue.isEmpty()){
            System.out.println("从头开始：" + queue.removeFromFirst());
        }
    }
}
