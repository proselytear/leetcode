package net.proselyte.leetcode.algorithms.strings;

/**
 * Problem #58
 *
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
        String input = "       ";
        int result = lengthOfLastWord(input);

        System.out.println("Input: " + input);
        System.out.println("Result: " + result);
    }

    public static int lengthOfLastWord(String s) {
        if(s == null){
            throw new IllegalArgumentException("Invalid input");
        }

        String [] sMas = s.split(" ");

        if(sMas.length == 0){
            return 0;
        }

        return sMas[sMas.length - 1].length();
    }
}
