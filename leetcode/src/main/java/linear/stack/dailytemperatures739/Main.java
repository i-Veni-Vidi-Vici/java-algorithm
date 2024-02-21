package linear.stack.dailytemperatures739;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] answer = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i+1; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    answer[i] = j-i;
                    break;
                }
            }
        }

        return answer;
    }
    // time limit
}
