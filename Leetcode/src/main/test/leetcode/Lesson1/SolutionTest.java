package leetcode.Lesson1;

import leetcode.Lesson1.Solution;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SolutionTest {

    @Test
    public void testTwoSum() {
        // Test value
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        // Call a method from the Solution class
        int[] result = Solution.twoSum(nums, target);

        // Check expected value
        Assertions.assertArrayEquals(expected, result);
    }
}
