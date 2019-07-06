package net.proselyte.leetcode.algorithms.strings;

/**
 * Problem #58
 * <p>
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * Example:
 * <p>
 * Input: "Hello World"
 * Output: 5
 */

public class LengthOfLastWord {
    public static void main(String[] args) {
        String input = "a";
        int result = lengthOfLastWord(input);

        System.out.println("Input: " + input);
        System.out.println("Result: " + result);
    }

    public static int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int counter = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (counter > 0 && s.charAt(i) == ' ') {
                break;
            }

            if (s.charAt(i) != ' ') {
                counter++;
            }
        }

        return counter;
    }
}
