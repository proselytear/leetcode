package net.proselyte.leetcode.algorithms;

/**
 * This class is created in order to check ability to solve already resolved issue.
 */

public class RandomCheck {
    public static void main(String[] args) {

        int input = 121;
        boolean result = isPalindrome(input);

        System.out.println("input: " + input);
        System.out.println("result: " + result);
    }

    static boolean isPalindrome(int i) {
        if (i < 0 || (i % 10 == 0 && i != 0)) {
            return false;
        }

        int copyOfI = i;
        int invertedNumber = 0;

        while (copyOfI > 0) {
            invertedNumber = invertedNumber * 10 + copyOfI % 10;
            copyOfI = copyOfI / 10;
        }

        return invertedNumber == i || invertedNumber * 10 == i;
    }
}
