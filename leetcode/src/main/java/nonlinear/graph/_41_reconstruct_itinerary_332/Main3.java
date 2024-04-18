package nonlinear.graph._41_reconstruct_itinerary_332;

import java.util.*;

public class Main3 {
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> result = new LinkedList<>();

        Map<String, PriorityQueue<String>> map = new HashMap<>();
        for (List<String> ticket : tickets) {
            map.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            map.get(ticket.get(0)).add(ticket.get(1));
        }
        String start = "JFK";
        Deque<String> stack = new ArrayDeque<>();
        stack.add(start);

        while (!stack.isEmpty()) {
            while (map.containsKey(stack.peek()) && !map.get(stack.peek()).isEmpty()) {

                stack.push(map.get(stack.peek()).poll());
            }

            result.add(0,stack.pop());
        }

        return result;
    }
    // 9 ms
}
