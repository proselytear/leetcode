package net.proselyte.leetcode.algorithms.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Problem #20
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: "(]"
 * Output: false
 * Example 4:
 * <p>
 * Input: "([)]"
 * Output: false
 * Example 5:
 * <p>
 * Input: "{[]}"
 * Output: true
 */

public class ValidParentheses {


    public static void main(String[] args) {


        String input = "([)]";
        boolean result = isValid(input);

        System.out.println("input: " + input);
        System.out.println("result: " + result);
    }

    public static boolean isValid(String s) {
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put('}', '{');
        mappings.put(')', '(');
        mappings.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!mappings.containsKey(c)) {
                stack.push(c);
            } else {
                char topElement = stack.isEmpty() ? '#' : stack.pop();

                if (topElement != mappings.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
