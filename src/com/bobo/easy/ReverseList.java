package com.bobo.easy;

import javax.xml.soap.Node;

/**
 * Created by evildoerDb on 2018/8/10 16:47
 *
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 * 206
 */
public class ReverseList {


    /**
     * 迭代实现
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }


    public  static ListNode reverseList1(ListNode head){
        return recu(head,null);
    }

    private static ListNode recu(ListNode head, ListNode pre) {
        if (head == null){
            return pre;
        }
        ListNode next = head.next;
        head.next = pre;
        return recu(next,head);

    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(reverseList1(head).val);
    }
}
