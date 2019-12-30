/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import com.leetcode.utils.ListNode;

/**
 *
 * @author kb7290
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNode = new ListNode(0);
        
        ListNode tmp = sumNode;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val = 0;
            int rem = 0;

            val = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carry;
            if (val > 9) {
                carry = val / 10;
                rem = val % 10;
            } else {
                rem = val;
                carry = 0;
            }

            ListNode ls = new ListNode(rem);
            sumNode.next = ls;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            sumNode = sumNode.next;

        }
        if (carry > 0) {
            sumNode.next = new ListNode(carry);
        }

        return tmp.next;

    }
}
