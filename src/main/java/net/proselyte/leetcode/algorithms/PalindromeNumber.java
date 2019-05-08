package net.proselyte.leetcode.algorithms;

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
