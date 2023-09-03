package trainee.sixteen;

public class Test {

    public static void main(String[] args) {
        String str = "d";
        try {
            throw new RuntimeException();
        } catch (Error error) {
            str += "e";
        } catch (RuntimeException e) {
            str += "f";
        }
        System.out.println(str);
    }
}
