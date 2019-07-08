package net.proselyte.leetcode.algorithms.strings;

/**
 * Problem #125
 * <p>
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 * <p>
 * Input: "race a car"
 * Output: false
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(input);

        System.out.println("input: " + input);
        System.out.println("Result: " + result);
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        if (s.isEmpty()) {
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }


            i++;
            j--;
        }

        return true;
    }
}
