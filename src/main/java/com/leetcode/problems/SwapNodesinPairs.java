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
public class SwapNodesinPairs {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        swapPairs(l1);
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null && curr.next != null) {
            ListNode tmp = curr.next;
            curr.next = tmp.next;
            tmp.next= curr;
            curr = tmp;
        }

        return prev;
    }
}
