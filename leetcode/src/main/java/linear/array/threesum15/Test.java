package linear.array.threesum15;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>();
        a.add(List.of(1,2,3));

        for (List<Integer> integers : a) {
            if (integers.containsAll(List.of(1, 2, 3))) {
                System.out.println("hi");

            }
        }

    }
}
