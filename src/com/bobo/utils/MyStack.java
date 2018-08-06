package com.bobo.utils;


/**
 * Created by evildoerDb on 2018/8/6 13:46
 *
 * 栈
 */
public  class MyStack<T> {


    class Node{
        //值
        T value;
        //上一节点
        Node pre;
        //下一节点
        Node next;

        public Node(T value, Node pre, Node next) {
            this.value = value;
            this.pre = pre;
            this.next = next;
        }
    }

    /**
     * 栈的大小
     */
    private int size;

    /**
     * 头节点
     */
    private Node head;

    /**
     * 尾节点
     */
    private Node tail;

    /**
     * 阙值  即栈的大小
     */
    private int threshold;


    public MyStack(T value) {
        Node nowNode = new Node(value,null,null);
        this.head = nowNode;
        this.tail = nowNode;
    }

    /**
     * 空参构造器
     */
    public MyStack() {
        this.threshold = 50;
        head = tail = null;
        size = 0;
    }

    /**
     * 带阙值构造器
     * @param threshold
     */
    public MyStack(int threshold) {
        this.threshold = threshold;
        this.size = 0;
    }

    /**
     * 入栈操作
     * @return
     */
    public T push(T value){

        //栈溢出
        if (threshold < (size+1)){
            throw new StackOverflowError();
        }
        Node node = new Node(value,null,null);
        if (head == null){
            head =node;
        }
        if (tail == null){
            tail = node;
        }else {
            tail.next = node;
            node.pre = tail;
            tail = node;
        }
        ++size;
        return value;
    }

    /**
     * 查看栈顶元素
     * @return
     */
    public T peek(){
        if (tail == null){
            throw new NullPointerException("栈为空");
        }
        return tail.value;
    }

    /**
     * 弹栈操作
     * @return
     */
    public T pop(){
        if (tail == null){
            throw new NullPointerException();
        }
        Node node = tail;
        if (size == 1){
            tail = head = null;
        }else {
            tail = tail.pre;
        }
        --size;

        return node.value;

    }


    /**
     * 查看栈的大小
     * @return
     */
    public int size(){
        return size;
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }
}
