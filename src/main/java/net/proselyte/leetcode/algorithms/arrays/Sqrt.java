package net.proselyte.leetcode.algorithms.arrays;

/**
 * Problem #69
 * <p>
 * Implement int sqrt(int x).
 * <p>
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * <p>
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 * <p>
 * Example 1:
 * <p>
 * Input: 4
 * Output: 2
 * Example 2:
 * <p>
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since
 * the decimal part is truncated, 2 is returned.
 */
public class Sqrt {
    public static void main(String[] args) {
        int number = 1_000_000_000;
        int sqrt = mySqrt(number);

        System.out.println("Number: " + number);
        System.out.println("sqrt: " + sqrt);
    }

    private static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x < 4) {
            return 1;
        }

        int low = 0;
        int high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int division = x / mid;
            if (mid < division) {
                low = mid + 1;
            } else if (mid > division) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return low - 1;
    }
}
