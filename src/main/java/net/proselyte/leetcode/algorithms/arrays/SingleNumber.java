package net.proselyte.leetcode.algorithms.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Problem #136
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example 1:
 * <p>
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 2, 1, 2};
        int result = singleNumber(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Result: " + result);
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i : nums) {
            uniqueNumbers.add(i);
        }

        Integer uniqueSum = uniqueNumbers.stream().mapToInt(Integer::intValue).sum();
        int numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
        }


        return 2* uniqueSum - numsSum;
    }
}
