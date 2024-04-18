package nonlinear.graph._41_reconstruct_itinerary_332;

import java.util.*;

public class Practice1 {
    public void dfs(Map<String, PriorityQueue<String>> data, List<String> result, String airline, int size) {
        if (data.containsKey(airline) && !data.get(airline).isEmpty()) {
            if (result.size() + 1 < size) {
                String value = data.get(airline).poll();
                List<String> list = new ArrayList<>();

                while (!(data.containsKey(value) && !data.get(value).isEmpty())) {
                    list.add(value);
                    value = data.get(airline).poll();
                }
                data.get(airline).addAll(list);
                airline = value;
                result.add(airline);
                dfs(data, result, airline, size);
            } else {
                airline = data.get(airline).poll();
                result.add(airline);
            }
        }
    }

    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> result = new ArrayList<>();
        Map<String, PriorityQueue<String>> data = new HashMap<>();
        int size = tickets.size() + 1;

        tickets.forEach(list -> {
            data.putIfAbsent(list.get(0), new PriorityQueue<>());
            data.get(list.get(0)).add(list.get(1));
        });

        result.add("JFK");
        dfs(data, result, "JFK", size);

        return result;
    }

    // Memory Limit Exceeded
}
