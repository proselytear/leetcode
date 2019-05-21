package net.proselyte.leetcode.algorithms.arrays;

import java.util.Arrays;

/**
 * Problem #189
 *
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * Note:
 * <p>
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before: " + Arrays.toString(nums));
        rotate(nums, 5);
        System.out.println("After: " + Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int[] numsCopy = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numsCopy[(i + k) % nums.length] = nums[i];
        }

        System.arraycopy(numsCopy, 0, nums, 0, nums.length);
    }
}
