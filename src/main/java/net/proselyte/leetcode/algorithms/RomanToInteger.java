package net.proselyte.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;


/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * Example 1:
 * <p>
 * Input: "III"
 * Output: 3
 * Example 2:
 * <p>
 * Input: "IV"
 * Output: 4
 * Example 3:
 * <p>
 * Input: "IX"
 * Output: 9
 * Example 4:
 * <p>
 * Input: "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 5:
 * <p>
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

public class RomanToInteger {
    public static void main(String[] args) {
        String input = "MCMXCIV";
        int result = romanToInt(input);

        System.out.println(input + ": " + result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        Map<String, Integer> symbolIntegerMap = new HashMap<String, Integer>();
        symbolIntegerMap.put("I", 1);
        symbolIntegerMap.put("V", 5);
        symbolIntegerMap.put("X", 10);
        symbolIntegerMap.put("L", 50);
        symbolIntegerMap.put("C", 100);
        symbolIntegerMap.put("D", 500);
        symbolIntegerMap.put("M", 1000);

        for (int i = 0; i < s.length(); i++) {
            // Handle not valid character
            if (!symbolIntegerMap.containsKey(String.valueOf(s.charAt(i)))) {
                throw new IllegalArgumentException("Input: " + s + " is not valid");
            }
            int intValue = symbolIntegerMap.get(String.valueOf(s.charAt(i)));
            int nextValue = s.length() > i + 1 ? symbolIntegerMap.get(String.valueOf(s.charAt(i + 1))) : 0;

            if (intValue < nextValue) {
                result -= intValue;
            } else {
                result += symbolIntegerMap.get(String.valueOf(s.charAt(i)));
            }
        }

        return result;
    }
}
