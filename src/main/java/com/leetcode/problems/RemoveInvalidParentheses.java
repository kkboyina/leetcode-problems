/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author kb7290
 */
public class RemoveInvalidParentheses {

    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("()())()");

//        for (int i = 0; i < sb.length(); i++) {
//           sb.deleteCharAt(i).toString());
//        }
        List<String> list = removeInvalidParentheses(")(f");
        list.stream().forEach((x) -> System.out.println(x));
    }

    public static List<String> removeInvalidParentheses(String s) {
        List<String> list = new ArrayList<>();
        if (s == null || s.length() == 0) {
            list.add("");
            return list;
        }
        if (checkIsStringValid(s)) {
            list.add(s);
        }
        for (int i = 0; i < s.length(); i++) {
            String check = new StringBuilder(s).deleteCharAt(i).toString();
            System.out.println("Check : String " + check);
            if (!list.contains(check) && checkIsStringValid(check)) {
                list.add(check);

            }
        }

        if (list.isEmpty()) {
            list.add("");
        } else {
            if (list.contains("")) {
                list.remove("");
            }
        }
        return list;
    }

    public static boolean checkIsStringValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : arr) {
            switch (c) {
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '(':
                    stack.push(c);
                    break;
            }
        }
        return stack.isEmpty();
    }
}
