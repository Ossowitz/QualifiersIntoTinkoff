package second.test;

import java.util.Scanner;

public class ErrorStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества моментов работы приложения
        int n = scanner.nextInt();

        // Ввод статистики ошибок
        String numbersString = "24113651";
        int[] errors = new int[numbersString.length()];

        for (int i = 0; i < numbersString.length(); i++) {
            errors[i] = Integer.parseInt(String.valueOf(numbersString.charAt(i)));
        }

        // Ввод количества периодов
        int m = scanner.nextInt();

        // Обработка каждого периода
        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            // Проверка, является ли период сбоем
            boolean isFailure = isFailurePeriod(errors, start, end);

            // Вывод ответа
            if (isFailure) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
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