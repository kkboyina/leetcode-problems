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
public class RotateLinkedList {

    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);

        rotateRight(list, 4);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (k >= length) {
            while (k > length) {
                k = k - length;
            }

            return rotateRight(head, k);

        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        int pos = 0;
        while (fastPtr != null) {
            fastPtr = fastPtr.next;
            if (pos++ > k) {
                slowPtr = slowPtr.next;
            }
        }
        ListNode resltPtr = slowPtr;

        while (slowPtr.next != null) {
            slowPtr = slowPtr.next;
        }
        slowPtr.next = head;
        head = resltPtr.next;
        resltPtr.next = null;
        return head;
    }
}
