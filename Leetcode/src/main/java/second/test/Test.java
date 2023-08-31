package second.test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String numbersString = "1 2 3 4 5 6 7 8 9";
        String[] numbersArrayString = numbersString.split(" ");
        int[] errors = new int[numbersArrayString.length];

        for (int i = 0; i < numbersArrayString.length; i++) {
            errors[i] = Integer.parseInt(numbersArrayString[i]);
        }

        System.out.println(Arrays.toString(errors));
    }

}
