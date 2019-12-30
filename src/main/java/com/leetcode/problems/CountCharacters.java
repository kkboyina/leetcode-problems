/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kb7290
 */
public class CountCharacters {

    public static void main(String[] args) {

        String[] arr = {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin",
            "ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb",
            "ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl",
            "boygirdlggnh", "xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx", "nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop", "hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx", "juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr", "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo", "oxgaskztzroxuntiwlfyufddl", "tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp", "qnagrpfzlyrouolqquytwnwnsqnmuzphne", "eeilfdaookieawrrbvtnqfzcricvhpiv", "sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz", "yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue", "hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv", "cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo", "teyygdmmyadppuopvqdodaczob", "qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs", "qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};

        String str = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i + ":=:" + countCharacters(arr[i], str));
//        }

        //System.out.println(countCharacters(arr[3], str));
         System.out.println(countCharacters("cat","atach"));
    }

    public static int countCharacters(String word, String chars) {
        List<Character> ls = new ArrayList<>();
        for (char c : chars.toCharArray()) {
            ls.add(c);
        }
        char[] arrs = word.toCharArray();

//        ls.containsAll(Arrays.asList(arr));
//        for (char c : arr) {
//            if (!ls.contains(c)) {
//                return 0;
//            }
//        }
        return ls.containsAll(Arrays.asList(arrs)) ? arrs.length : 0;
    }

}
