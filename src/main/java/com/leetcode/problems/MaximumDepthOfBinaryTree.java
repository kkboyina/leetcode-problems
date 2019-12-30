/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import com.leetcode.utils.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author kb7290
 */
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
      //  String line  = "1,2,4,1,0,3,-1,5,1,0,6,0,8";
       
        //System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        int level = 0;
        if (root == null) {
            return level;
        }
        Queue<TreeNode> que1 = new LinkedList<>();
        Queue<TreeNode> que2 = new LinkedList<>();
        que1.add(root);
        TreeNode tmp;
        while (!que1.isEmpty()) {
            tmp = que1.poll();
            if (tmp.left != null) {
                que2.add(tmp.left);
            }
            if (tmp.right != null) {
                que2.add(tmp.right);
            }
            if (que1.isEmpty()) {
                level += 1;
                while (!que2.isEmpty()) {
                
                tmp = que2.poll();
                if (tmp.left != null) {
                    que1.add(tmp.left);
                }
                if (tmp.right != null) {
                    que1.add(tmp.right);
                }
                if (que2.isEmpty()) {
                    level += 1;
                }
            }
            }
            
            
        }

        return level;
    }

}
