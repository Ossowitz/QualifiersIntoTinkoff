package tinkoff;

import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] roads = new int[M][3];

        for (int i = 0; i < M; i++) {
            roads[i][0] = scanner.nextInt();
            roads[i][1] = scanner.nextInt();
            roads[i][2] = scanner.nextInt();
        }

        int minWaterLevel = findMinWaterLevel(N, M, roads);

        System.out.println(minWaterLevel);
    }

    private static int findMinWaterLevel(int N, int M, int[][] roads) {
        int maxWaterLevel = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            for (int j = i + 1; j < M; j++) {
                int s1 = roads[i][0];
                int f1 = roads[i][1];
                int h1 = roads[i][2];

                int s2 = roads[j][0];
                int f2 = roads[j][1];
                int h2 = roads[j][2];

                if ((s1 != f2 || f1 != s2) && (Math.max(h1, h2) - Math.min(h1, h2) < maxWaterLevel)) {
                    maxWaterLevel = Math.max(h1, h2) - Math.min(h1, h2);
                }
            }
        }

        return maxWaterLevel;
    }
}