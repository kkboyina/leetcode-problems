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
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        mergeTwoLists(l1, l2);

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode mergeList = new ListNode(0);
//        ListNode tp = mergeList;
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                  mergeList.next = l1;
//                l1 = l1.next;
//            } else {
//                mergeList.next = l2;
//                l2 = l2.next;
//            }
//            
//            mergeList = mergeList.next;
//        }
//        
//        if(l1!=null){
//            mergeList.next = l1;
//        }
//         if(l2!=null){
//            mergeList.next = l2;
//        }
//
//        return tp.next;
        ListNode ls = new ListNode(0);
        ListNode lp = ls;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ls = l1;
                l1 = l1.next;
            } else {
                ls = l2;
                l1 = l2.next;
            }
            ls = ls.next;
        }
        if (l1 != null) {
            ls = l1.next;
        }
        if (l2 != null) {
            ls = l2.next;
        }
        return lp.next;
    }
}
