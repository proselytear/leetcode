package net.proselyte.leetcode.algorithms;


/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 * <p>
 * Coud you solve it without converting the integer to a string?
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        boolean result = isPalindrome(number);

        System.out.println("Number: " + number + " is palindrome: " + result);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNumber = 0;
        int copyOfX = x;

        while (copyOfX != 0) {
            reversedNumber = reversedNumber * 10 + copyOfX % 10;
            copyOfX = copyOfX / 10;
        }

        return x == reversedNumber || x == reversedNumber / 10;
    }

}
