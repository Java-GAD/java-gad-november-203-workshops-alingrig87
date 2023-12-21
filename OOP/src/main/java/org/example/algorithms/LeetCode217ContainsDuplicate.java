package org.example.algorithms;


import java.util.HashSet;
import java.util.Set;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,1]
//        Output: true
//        Example 2:
//
//        Input: nums = [1,2,3,4]
//        Output: false
//        Example 3:
//
//        Input: nums = [1,1,1,3,3,4,3,2,4,2]
//        Output: true
public class LeetCode217ContainsDuplicate {
    public static boolean containsDuplicate(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int number: numbers) {
            if(set.contains(number))
            {
                return true;
            }
            set.add(number);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 1};
        int[] numbers1 = {2, 3, 5, 1};
        int[] numbers2 = {2, 2, 3, 5, 1};

        System.out.println(containsDuplicate(numbers));
        System.out.println(containsDuplicate(numbers1));
        System.out.println(containsDuplicate(numbers2));
    }
}
