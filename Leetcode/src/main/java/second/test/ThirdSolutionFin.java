package second.test;

import java.util.*;

public class ThirdSolutionFin {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Ввод количества моментов работы приложения
        int n = scanner.nextInt();

        // Ввод статистики ошибок
        int[] errors = new int[n];
        for (int i = 0; i < n; i++) {
            errors[i] = scanner.nextInt();
        }

        // Ввод количества периодов
        int m = scanner.nextInt();
        int[] messages = new int[n];

        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();


        }
    }
}
