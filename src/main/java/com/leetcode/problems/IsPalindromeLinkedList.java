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
public class IsPalindromeLinkedList {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};

        ListNode list = prepareList(arr);
        System.out.println(isPalindrome(list));

    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        ListNode revrsePtr = head;

        ListNode prev = null;

        ListNode curr = null;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        while (slowPtr != null) {
            curr = slowPtr.next;
            slowPtr.next = prev;
            prev = slowPtr;
            slowPtr = curr;
        }

        while (prev != null && revrsePtr != null) {
            if (prev.val != revrsePtr.val) {
                return false;
            }
            prev = prev.next;
            revrsePtr = revrsePtr.next;
        }
        return true;
    }

    public static boolean isListPalindrome(ListNode head) {

        ListNode pace = head;
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        ListNode revPtr = reverse(slowPtr);

        return compare(pace, revPtr);
    }

    public static ListNode prepareList(int[] arr) {
        ListNode ls = new ListNode(0);
        ListNode tmp = ls;
        for (int i : arr) {
            ls.next = new ListNode(i);
            ls = ls.next;
        }
        return tmp.next;

    }

    public static boolean compare(ListNode l1, ListNode l2) {

        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;

    }

    public static ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
