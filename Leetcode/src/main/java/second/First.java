package second;

import java.util.*;

public class First {

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
            System.out.println(0);
        } else {
            System.out.println(uniqueCharacters.size() - (n - k));
        }
    }
}
