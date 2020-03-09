package com.bobo.medium;


/**
 * @author Boild
 * @date 2020-03-09
 */
public class AddTwoNumbers {


    /**
     * 内存超限
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstValue = 0;
        int secondValue = 0;
        int bit = 0;
        while (l1 != null) {

            firstValue = l1.val * (int)Math.pow(10, bit++) + firstValue ;
            l1 = l1.next;
        }
        bit = 0;
        while (l2 != null) {

            secondValue = l2.val * (int)Math.pow(10, bit++) + secondValue ;
            l2 = l2.next;
        }

        int value = firstValue + secondValue;

        ListNode root = new ListNode(0);
        ListNode pre = root;
        root.next = pre;
        while (value != 0) {
            pre.next = new ListNode(value % 10);
            pre = pre.next;

            value /= 10;
        }

        return root.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0), pre = root;
        int addOne = 0;
        while (l1 != null || l2 != null || addOne != 0) {
            if (l1 != null) {
                addOne += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                addOne += l2.val;
                l2 = l2.next;
            }
            pre.next = new ListNode(addOne % 10);
            pre = pre.next;
            addOne /= 10;
        }

        return root.next;
    }




    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);

        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);

        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode root = addTwoNumbers(l1, l2);

        while (root != null) {
            System.out.println(root.val);
            root = root.next;
        }
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
