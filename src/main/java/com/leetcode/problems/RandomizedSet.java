/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kb7290
 */
class RandomizedSet {

    Set<Integer> hs;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        hs = new HashSet<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hs.contains(val)){
            hs.add(val);
            return true;
        }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
         if(hs.contains(val)){
            hs.remove(val);
            return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return hs.stream().findAny().get();
    }
}
