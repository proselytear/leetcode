package net.proselyte.leetcode.algorithms;

import java.util.Arrays;

/**
 * Problem #53
 * <p>
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] input = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(input);

        System.out.println("input: " + Arrays.toString(input));
        System.out.println("result: " + result);
    }

    public static int maxSubArray(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        if (nums.length == 0) {
            return nums[0];
        }

        int maxValueStart = Integer.MIN_VALUE;
        int maxValueEnd = 0;

        for (int i = 0; i < nums.length; i++) {
            maxValueEnd += nums[i];

            if (maxValueStart < maxValueEnd) {
                maxValueStart = maxValueEnd;
            }

            if (maxValueEnd < 0) {
                maxValueEnd = 0;
            }
        }
        return maxValueStart;
    }
}
