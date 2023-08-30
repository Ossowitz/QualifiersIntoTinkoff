package leetcode.Lesson2;

public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reversedNumber = 0;
        int originNumber = x;

        while (x != 0) {
            int digit = x % 10;
            reversedNumber = reversedNumber * 10 + digit;
            x /= 10;
        }

        return originNumber == reversedNumber;
    }
}
