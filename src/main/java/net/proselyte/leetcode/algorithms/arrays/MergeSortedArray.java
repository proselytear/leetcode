package net.proselyte.leetcode.algorithms.arrays;

import java.util.Arrays;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 * <p>
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 */

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{-100, 5, 6};

        System.out.println("Before: " + Arrays.toString(nums1));
        merge(nums1, 3, nums2, 3);
        System.out.println("After: " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = m - 1;
        int i2 = n - 1;
        int index = nums1.length - 1;
        while (i2 >= 0) {
            if (i1 < 0 || nums2[i2] >= nums1[i1]) {
                nums1[index--] = nums2[i2--];
            } else {
                nums1[index--] = nums1[i1--];
            }
        }
    }
}
