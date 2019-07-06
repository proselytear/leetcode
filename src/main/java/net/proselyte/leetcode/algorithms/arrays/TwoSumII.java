package net.proselyte.leetcode.algorithms.arrays;

import java.util.Arrays;

/**
 * Problem #167
 *
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * <p>
 * Note:
 * <p>
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int[] result = twoSum(numbers, 9);

        System.out.println("numbers:" + Arrays.toString(numbers));
        System.out.println("Result:" + Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[j] == target - numbers[i]){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found for input array.");
    }
}
