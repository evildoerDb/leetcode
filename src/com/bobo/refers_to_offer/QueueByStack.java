package com.bobo.refers_to_offer;

import java.util.Stack;

/**
 * @author Boild
 * @date 2020-05-20
 */
public class QueueByStack {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int result = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        QueueByStack queue = new QueueByStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
