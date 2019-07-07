package net.proselyte.leetcode.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem #387
 * <p>
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "cc";
        int result = firstUniqueChar(s);

        System.out.println("Input: " + s);
        System.out.println("Result: " + result);
    }

    public static int firstUniqueChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(countMap.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
}
