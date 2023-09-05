package Sber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int maxSheriffCount = getMaxSheriffCount(line);
        System.out.print(maxSheriffCount);
    }

    public static int getMaxSheriffCount(String input) {
        Map<Character, Integer> charCount = new HashMap<>();
        String targetWord = "sheriff";
        int maxSheriffCount = Integer.MAX_VALUE;

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : targetWord.toCharArray()) {
            if (!charCount.containsKey(c)) {
                maxSheriffCount = 0;
                break;
            }

            int wordCount = charCount.get(c);
            maxSheriffCount = Math.min(maxSheriffCount, wordCount);
        }

        return maxSheriffCount;
    }
}
