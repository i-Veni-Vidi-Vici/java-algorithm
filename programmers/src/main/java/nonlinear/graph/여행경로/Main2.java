package nonlinear.graph.여행경로;

import java.util.*;

public class Main2 {
    public String[] solution(String[][] tickets) {
        Map<String, PriorityQueue<String>> map = new HashMap<>();

        for (String[] ticket : tickets) {
            map.putIfAbsent(ticket[0], new PriorityQueue<String>());
            map.get(ticket[0]).add(ticket[1]);
        }

        Deque<String> stack = new ArrayDeque<>();
        stack.push("ICN");
        List<String> result = new LinkedList<>();
        while (!stack.isEmpty()) {
            while (map.containsKey(stack.peek()) && !map.get(stack.peek()).isEmpty()) {
                stack.push(map.get(stack.peek()).poll());
            }
            result.add(0, stack.pop());
        }

        return result.toArray(new String[0]);
    }
    //채점 결과
    //정확성: 100.0
    //합계: 100.0 / 100.0
}
