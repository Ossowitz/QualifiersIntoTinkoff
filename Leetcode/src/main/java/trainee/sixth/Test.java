package trainee.sixth;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Integer[] ageArray;
        try {
            String age = "29";
            ageArray = new Integer[]{Integer.parseInt(age)};
        } catch (NumberFormatException nfe) {
            System.out.println("Error parsing age");
        }
        // Compilation exception
//        System.out.println(Arrays.toString(ageArray));
    }
}
