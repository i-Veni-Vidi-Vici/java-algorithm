package string.manipulation.fizz_buzz_412;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        String s1 = "Fizz";
        String s2 = "Buzz";

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add(s1 + s2);
            } else if (i % 3 == 0) {
                result.add(s1);
            } else if (i % 5 == 0) {

                result.add(s2);
            } else {
                result.add(String.valueOf(i));

            }
        }

        return result;
    }
    // 2ms
}
