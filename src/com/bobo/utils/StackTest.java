package com.bobo.utils;

/**
 * Created by evildoerDb on 2018/8/6 14:04
 */
public class StackTest {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(6);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("当前栈的大小 ：" + stack.size());
        while (!stack.isEmpty()){
            System.out.print("栈顶元素为 " +stack.peek() + " 弹栈元素为 " + stack.pop()+" ");
            System.out.println(" 当前栈的大小 ：" + stack.size());
        }
    }
}
