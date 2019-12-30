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
public class LinkedListCycle {

    public static void main(String[] args) {

    }

    /**
     * , return the node where the cycle begins. If there is no cycle, return null.
     * @param head//Start of Loop in a Linked List
     * @return 
     */
    public static ListNode hasCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        ListNode bossPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (fastPtr == slowPtr) {
                break;
            }
        }

        while (bossPtr != fastPtr) {

            if (bossPtr == fastPtr) {
                return bossPtr;
            }

            bossPtr = bossPtr.next;
            fastPtr = fastPtr.next;

        }

        return null;
    }
}
