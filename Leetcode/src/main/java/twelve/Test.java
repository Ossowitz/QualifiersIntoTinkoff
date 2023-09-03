package twelve;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> counts = new ArrayList<>();
        counts.add(1);
        counts.add(5);
        counts.add(8);
        counts.add(2);
        counts.remove(1);
        counts.remove(2);
        System.out.println(counts);
    }
}
