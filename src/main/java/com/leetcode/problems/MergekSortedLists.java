/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import com.leetcode.utils.ListNode;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author kb7290
 */
public class MergekSortedLists {

    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((ListNode o1, ListNode o2) -> o1.val > o2.val ? 1 : (o1.val < o2.val ? -1 : 0));
//        for (ListNode list : lists) {
//            
//            pq.add(list.next);
//        }

         for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }
        ListNode list = new ListNode(0);
        ListNode curr = list;

        while (!pq.isEmpty()) {
            curr.next = pq.poll();
            curr = curr.next;
            if (curr.next != null) {
                pq.add(curr.next);
            }
        }

        return list.next;
    }

}
