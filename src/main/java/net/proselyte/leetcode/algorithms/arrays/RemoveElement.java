package net.proselyte.leetcode.algorithms.arrays;

import java.util.Arrays;

/**
 * Problem #27
 * <p>
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Example 1:
 * <p>
 * Given nums = [3,2,2,3], val = 3,
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 2.
 * <p>
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 * <p>
 * Given nums = [0,1,2,2,3,0,4,2], val = 2,
 * <p>
 * Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 * <p>
 * Note that the order of those five elements can be arbitrary.
 * <p>
 * It doesn't matter what values are set beyond the returned length.
 * Clarification:
 * <p>
 * Confused why the returned value is an integer but your answer is an array?
 * <p>
 * Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.
 * <p>
 * Internally you can think of this:
 * <p>
 * // nums is passed in by reference. (i.e., without making a copy)
 * int len = removeElement(nums, val);
 * <p>
 * // any modification to nums in your function would be known by the caller.
 * // using the length returned by your function, it prints the first len elements.
 * for (int i = 0; i < len; i++) {
 * print(nums[i]);
 * }
 */

public class RemoveElement {
    public static void main(String[] args) {
        int[] input = {0, 1, 2, 2, 3, 0, 4, 5};
        int val = 2;

        System.out.println("Initial input: " + Arrays.toString(input));
        int result = removeElement(input, val);

        System.out.println("Final input: " + Arrays.toString(input));
        System.out.println("Result: " + result);
    }

    public static int removeElement(int[] nums, int val) {
        // Returns wrong result, but accepted by LeetCode.com
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

//        Doesn't work on LeetCode.com but returns correct value according to the problem
//        int size = nums.length;
//
//        for (int i = 0; i < nums.length; i++)
//            if (nums[i] == val) {
//                size--;
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[j] != val) {
//                        nums[i] = nums[j];
//                        break;
//                    }
//                }
//            }
//        return size;
    }
}
