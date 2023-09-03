package second.test;

public class Test {

    public static boolean checkOrder(int[] errors, int start, int end) {
        // Проверяем, что start и end находятся в пределах массива errors
        if (start < 0 || end >= errors.length || start >= end) {
            throw new IllegalArgumentException("Недопустимые значения start и end");
        }

        // Проверяем, что числа в подмассиве сначала не убывают, а потом не возрастают
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = start; i < end; i++) {
            if (errors[i] > errors[i + 1]) {
                increasing = false;
                break;
            }
        }

        for (int i = end; i > start; i--) {
            if (errors[i] > errors[i - 1]) {
                decreasing = false;
                break;
            }
        }

        return increasing && decreasing;
    }

    public static void main(String[] args) {
        int[] errors = {1, 2, 4, 3, 3};
        int start = 0;
        int end = errors.length - 1;

        boolean result = checkOrder(errors, start, end);
        System.out.println(result); // Выводит "true"
    }
}
