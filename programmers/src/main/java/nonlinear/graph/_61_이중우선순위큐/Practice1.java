package nonlinear.graph._61_이중우선순위큐;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Practice1 {
    public int[] solution(String[] operations) {
        List<Integer> numbers = new LinkedList<>();
        Collections.sort(numbers);

        for (String operation : operations) {
            String[] value = operation.split(" ");
            if (value[0].equals("I")) {

            }

        }


        int[] answer = {};
        return answer;
    }
    // fail
}
