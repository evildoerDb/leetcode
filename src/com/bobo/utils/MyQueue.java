package com.bobo.utils;

import java.util.Arrays;

/**
 * Created by evildoerDb on 2018/8/6 14:19
 *
 * 基于数组的队列
 */
public class MyQueue<T> {


    /**
     * 数组类型的队列
     */
    private Object [] table;

    /**
     * 队列开始位置的索引
     */
    private int begin;

    /**
     * 队列结束位置的索引
     */
    private int end;

    public MyQueue(int size) {
        this.table = new Object[size];
        this.begin = size >>> 1;
        this.end = size >>> 1 ;
    }

    public MyQueue() {
        this.table = new Object[100];
        this.begin = 100 >>> 1;
        this.end = 100 >>> 1 ;
    }

    /**
     * 加在最后一个
     * @param value
     */
    public void addLast(T value){
        if ((end +1) >= this.table.length){

            int length = this.table.length << 1;
            length = length >= Integer.MAX_VALUE ? Integer.MAX_VALUE : length;
            table = Arrays.copyOfRange(table,begin,end);
        }

        table[end++] = value;
    }

    /**
     * 头部增加
     * @param value
     */
    public void  addFirst(T value){
        if ((begin -1) < 0){
            int length = this.table.length << 1;
            length = length >= Integer.MAX_VALUE ? Integer.MAX_VALUE : length;
            table = Arrays.copyOfRange(table,begin,end);
        }
        table[--begin] = value;
    }

    /**
     * 删除尾元素
     * @return
     */
    public T removeFromLast(){
        return (T) table[end--];
    }


    /**
     * 删除头元素
     * @return
     */
    public T removeFromFirst(){
        return (T) table[begin++];
    }

    public boolean isEmpty(){
        return end - begin == 0 ? true : false;
    }
}
