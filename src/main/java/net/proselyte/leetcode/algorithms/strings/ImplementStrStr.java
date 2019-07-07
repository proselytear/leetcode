package net.proselyte.leetcode.algorithms.strings;

/**
 * Problem #28
 *
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 * <p>
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * <p>
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */

public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "pi";

        int result = strStr(haystack, needle);

        System.out.println("haystack: " + haystack);
        System.out.println("needle: " + needle);
        System.out.println("Result: " + result);
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            throw new IllegalArgumentException("Input haystack | needle cannot be null");
        }

        int hayStackLength = haystack.length();
        int needleLength = needle.length();

        if (hayStackLength == 0 && needleLength == 0) {
            return 0;
        }

        if (needleLength > hayStackLength) {
            return -1;
        }


        if (hayStackLength == needleLength && haystack.equalsIgnoreCase(needle)) {
            return 0;
        }

        for (int i = 0; i < hayStackLength; i++) {

            if (i + needleLength > hayStackLength) {
                break;
            }

            if (haystack.substring(i, i + needleLength).equalsIgnoreCase(needle)) {
                return i;
            }
        }

        return -1;
    }
}
