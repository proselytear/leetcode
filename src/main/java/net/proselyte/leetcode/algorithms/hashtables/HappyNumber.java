package net.proselyte.leetcode.algorithms.hashtables;

import java.util.HashSet;
import java.util.Set;

/**
 * Problm #202
 * <p>
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * <p>
 * Example:
 * <p>
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */

public class HappyNumber {
    // not working here due to static word - need client class
    final static Set<Integer> seen = new HashSet<>();

    public static void main(String[] args) {

        int input = 19;
        boolean result = isHappy(input);
        System.out.println("input: " + input);
        System.out.println("result: " + result);
    }

    public static boolean isHappy(int n) {

        if (n == 1) {
            return true;
        }

        if (seen.contains(n)) {
            return false;
        }

        seen.add(n);
        int sumOfDigitsSquares = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            sumOfDigitsSquares += digit * digit;
        }
        return isHappy(sumOfDigitsSquares);
    }
}
