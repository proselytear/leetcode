package net.proselyte.leetcode.algorithms.strings;

/**
 * Problem #709
 * <p>
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 * <p>
 * Input: "here"
 * Output: "here"
 * Example 3:
 * <p>
 * Input: "LOVELY"
 * Output: "lovely"
 */

public class ToLowerCase {
    public static void main(String[] args) {
        String input = "Hello";
        String result = toLowerCase(input);

        System.out.println("input: " + input);
        System.out.println("result: " + result);
    }

    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >64 && str.charAt(i) < 91) {
                int j = str.charAt(i) + 32;
                sb.append((char) j);
            }else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
