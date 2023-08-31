package second;

import java.util.*;

public class SecondSolutionFin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        String password = scanner.next();

        Set<Character> uniqueCharacters = new HashSet<>();
        for (char c : password.toCharArray()) {
            uniqueCharacters.add(c);
        }

        if (k >= n) {
            System.out.print(0);
        } else if (k - uniqueCharacters.size() == 1) {
            System.out.print(1);
        } else {
            System.out.print(uniqueCharacters.size() - (n - k));
        }
    }
}
