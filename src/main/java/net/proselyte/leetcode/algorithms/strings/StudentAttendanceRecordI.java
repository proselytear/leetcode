package net.proselyte.leetcode.algorithms.strings;

/**
 * Problem #551
 * <p>
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
 * <p>
 * You need to return whether the student could be rewarded according to his attendance record.
 * <p>
 * Example 1:
 * Input: "PPALLP"
 * Output: True
 * Example 2:
 * Input: "PPALLL"
 * Output: False
 */

public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        String input = "LALL";
        boolean result = checkRecord(input);

        System.out.println("input: " + input);
        System.out.println("result: " + result);
    }

    public static boolean checkRecord(String s) {
        int absents = 0;

        if (s.contains("LLL")) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                absents++;
            }

            if (absents > 1) {
                return false;
            }
        }


        return true;
    }
}
