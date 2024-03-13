package nonlinear.graph.reconstructitinerary332;

import java.util.*;

public class Main2 {
    public static void dfs(Map<String, PriorityQueue<String>> map, List<String> result, String start) {
        while (map.containsKey(start)  && !map.get(start).isEmpty()  ) {
            dfs(map, result, map.get(start).poll());
        }
        result.add(0, start);
    }

    public static List<String> findItinerary(List<List<String>> tickets) {
        List<String> result = new LinkedList<>();

        Map<String, PriorityQueue<String>> map = new HashMap<>();
        for (List<String> ticket : tickets) {
            map.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            map.get(ticket.get(0)).add(ticket.get(1));
        }

        dfs(map, result, "JFK");

        return result;
    }

    public static void main(String[] args) {
        findItinerary(List.of(List.of("JFK", "SFO"), List.of("JFK", "ATL"), List.of("SFO", "ATL"),
                List.of("ATL", "JFK"), List.of("ATL", "SFO")));
    }

    // 7ms
}
