package net.proselyte.leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

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
