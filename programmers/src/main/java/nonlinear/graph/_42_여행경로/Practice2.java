package nonlinear.graph._42_여행경로;

import java.util.*;

public class Practice2 {
    public static String[] solution(String[][] tickets) {
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        List<String> result = new LinkedList<>();
        for (String[] ticket : tickets) {
            map.putIfAbsent(ticket[0], new PriorityQueue<>());
            map.get(ticket[0]).add(ticket[1]);
        }

        Deque<String> stack = new ArrayDeque<>();
        stack.add("ICN");

        while (!stack.isEmpty()) {
            if (map.containsKey(stack.peekLast()) && !map.get(stack.peekLast()).isEmpty()) {
                stack.add(map.get(stack.peekLast()).poll());
            } else result.add(0, stack.removeLast());

        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        solution(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}});
    }

//    테스트 1 〉	통과 (0.87ms, 74.9MB)
//테스트 2 〉	통과 (0.47ms, 76.6MB)
//테스트 3 〉	통과 (0.50ms, 75.4MB)
//테스트 4 〉	통과 (0.39ms, 76MB)
}
