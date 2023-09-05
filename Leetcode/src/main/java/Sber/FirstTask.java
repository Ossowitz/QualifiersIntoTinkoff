package Sber;

import java.util.*;

public class FirstTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();

        int[] revolverPrices = new int[n];
        for (int i = 0; i < n; i++) {
            revolverPrices[i] = scanner.nextInt();
        }

        Arrays.sort(revolverPrices);

        int affordableRevolverPrice = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (revolverPrices[i] <= s) {
                affordableRevolverPrice = revolverPrices[i];
                break;
            }
        }

        System.out.print(affordableRevolverPrice);
    }

}
