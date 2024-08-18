package nonlinear.graph._41_reconstruct_itinerary_332;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Practice2 {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        for (List<String> ticket : tickets) {
            if (map.get(ticket.get(0)) == null) {
                map.put(ticket.get(0), new PriorityQueue<>());
            }
            map.get(ticket.get(0)).add(ticket.get(1));
        }

        List<String> result = new ArrayList<>();
        String value = "JFK";
        result.add(value);
        while (true) {
            if (map.get(value) == null) {
                break;
            }
            String to = map.get(value).poll();
            Queue<String> queue = new ArrayDeque<>();
            while (map.get(to) == null || map.get(to).isEmpty()) {
                queue.add(to);
                if (!map.get(value).isEmpty()) {
                    to = map.get(value).poll();

                }else break;
            }
            map.get(value).addAll(queue);


            if (to == null) {
                break;
            }

            result.add(to);
            value = to;
        }

        return result;
    }

    // error

}
