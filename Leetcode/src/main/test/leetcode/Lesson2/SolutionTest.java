package leetcode.Lesson2;

import leetcode.Lesson2.Solution;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SolutionTest {

    @Test
    public void testIsPalindrome() {
        int number = 121;
        boolean expected = true;

        boolean actual = Solution.isPalindrome(number);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindromeNegativeNumber() {
        int number = -121;
        boolean expected = false;

        boolean actual = Solution.isPalindrome(number);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindromeNotPalindromeNumber() {
        int number = 10;
        boolean expected = false;

        boolean actual = Solution.isPalindrome(number);

        Assertions.assertEquals(expected, actual);
    }
}
