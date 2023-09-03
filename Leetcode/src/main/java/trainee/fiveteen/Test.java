package trainee.fiveteen;

public class Test {
    public static void main(String[] args) {
        String str = "d";
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            str += "e";
        } finally {
            str += "f";
        }
        System.out.println(str);
    }
}
