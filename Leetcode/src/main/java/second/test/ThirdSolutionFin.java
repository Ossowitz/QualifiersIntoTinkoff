package second.test;

import java.util.*;

public class ThirdSolutionFin {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int[] errors = new int[n];

        String numbers = scanner.nextLine();
        String[] numbersArray = numbers.split(" ");
        for (int i = 0; i < n; i++) {
            errors[i] = Integer.parseInt(numbersArray[i]);
        }

//         Ввод количества периодов
        int m = scanner.nextInt();
        int[] messages = new int[n];

        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();


        }
    }
}
