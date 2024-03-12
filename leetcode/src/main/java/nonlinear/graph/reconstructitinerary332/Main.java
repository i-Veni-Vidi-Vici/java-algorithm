package nonlinear.graph.reconstructitinerary332;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> result = new ArrayList<>();

        int index = -1;
        String next = "ZZZ";
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).get(0).equals("JFK") && next.compareTo(tickets.get(i).get(1))>= 0) {
                index = i;
                next = tickets.get(i).get(1);
            }
        }

        result.add("JFK");
        result.add(next);
        tickets.remove(index);

        while (!tickets.isEmpty()) {
            for (int i = 0; i < tickets.size(); i++) {
                if (result.get(result.size() - 1).equals(tickets.get(i).get(0))) {
                    result.add(tickets.get(i).get(1));
                    tickets.remove(i);
                }
            }
        }


        return result;
    }
    // Time Limit Exceeded
}
