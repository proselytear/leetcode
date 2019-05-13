package net.proselyte.leetcode.algorithms.arrays;

import java.util.Arrays;

/**
 * Problem #35
 * <p>
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 * <p>
 * Input: [1,3,5,6], 0
 * Output: 0
 */

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 6};
        int target = 116;

        int result = searchInsert(input, target);

        System.out.println("input: " + Arrays.toString(input));
        System.out.println("target: " + target);
        System.out.println("result: " + result);
    }

    public static int searchInsert(int[] nums, int target) {

        if (nums == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        if (nums.length == 0) {
            return 0;
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = nums[mid];

            if (midVal == target) {
                return mid;
            }

            if (midVal < target) {
                low = mid + 1;
            }

            if (midVal > target) {
                high = mid - 1;
            }
        }

        return low;
    }
}

