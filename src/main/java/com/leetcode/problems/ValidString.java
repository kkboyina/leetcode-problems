/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.Stack;

/**
 *
 * @author kb7290
 */
public class ValidString {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < arr.length; i++) {
            
        
            switch (arr[i]) {
                case '}':
                    if (!st.isEmpty() && st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                    break;
                case ')':
                    if (!st.isEmpty() && st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (!st.isEmpty() && st.peek() == '[') {
                        st.pop();
                    } else {
                        return false;
                    }
                    break;
                default:
                    st.push(arr[i]);
            }
        }
        if (!st.isEmpty()) {
            return false;
        }
        return true;

    }

}
