package second.test;

import java.util.Scanner;

public class ErrorStatistics {
    public static void main(String[] args) {
        
    }

    // Метод, проверяющий, является ли период сбоем
    private static boolean isFailurePeriod(int[] errors, int start, int end) {
        // Проверка, что количество ошибок в первом моменте меньше или равно количеству ошибок во втором моменте
        if (errors[start - 1] > errors[end - 1]) {
            return false;
        }

        // Проверка, что количество ошибок в каждом следующем моменте больше или равно количеству ошибок в предыдущем моменте
        for (int i = start; i < end; i++) {
            if (errors[i] < errors[i - 1]) {
                return false;
            }
        }

        // Период является сбоем
        return true;
    }
}