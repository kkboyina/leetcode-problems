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
public class RemoveNthNodeFromEndofList {

    public static void main(String[] args) {

        ListNode list = new ListNode(1);
//        list.next = new ListNode(2);
//        list.next.next = new ListNode(3);
//        list.next.next.next = new ListNode(4);
//        list.next.next.next.next = new ListNode(5);
        removeNthFromEnd(list, 1);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode ls = new ListNode(0);
        ls.next  = head;
            ListNode slowPtr = ls;
            ListNode fastPtr = ls;
            ListNode result = ls;
            int pos = 0;
            while (fastPtr != null && pos++ <= n) {
                fastPtr = fastPtr.next;
            }
            while (fastPtr != null && fastPtr.next != null) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }
            
                 slowPtr.next = slowPtr.next.next;
           

            return result.next;
        
    }
}
