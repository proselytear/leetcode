package net.proselyte.leetcode.algorithms.arrays;

import java.util.Arrays;

/**
 * Problem #66
 * <p>
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 * <p>
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */

public class PlusOne {
    public static void main(String[] args) {
        int[] input = new int[]{9, 9, 9};
        System.out.println("input: " + Arrays.toString(input));

        int[] output = plusOne(input);

        System.out.println("output: " + Arrays.toString(output));
    }

    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        while (digits[index] == 9) {
            digits[index] = 0;
            index--;

            if (index < 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
                break;
            }
        }
        if (index >= 0) {
            digits[index]++;
        }

        return digits;
    }
}
