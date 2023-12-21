package org.example.algorithms;

import java.util.HashMap;
import java.util.Map;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//
//        Example 1:
//
//        Input: s = "anagram", t = "nagaram"
//        Output: true
//        Example 2:
//
//        Input: s = "rat", t = "car"
//        Output: false
public class LeetCode242ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

//        Input: s = "anagram", t = "nagaram"
        for(char c: s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for(char c: t.toCharArray()) {
            if(!charCount.containsKey(c) || charCount.get(c) <= 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagrap", "nagaram"));
    }
}
