package nonlinear.graph._42_여행경로;

import java.util.*;

public class Practice1 {

    public void dfs(Map<String, PriorityQueue<String>> data, LinkedList<String> result, String airport){
        while (data.containsKey(airport) && !data.get(airport).isEmpty()) {
            dfs(data, result, data.get(airport).poll());
        }

        result.add(0, airport);
    }


    public String[] solution(String[][] tickets) {
        Map<String, PriorityQueue<String>> data = new HashMap<>();

        for (int i = 0; i < tickets.length; i++) {
            data.putIfAbsent(tickets[i][0], new PriorityQueue<>());
            data.get(tickets[i][0]).add(tickets[i][1]);
        }

        LinkedList<String> result = new LinkedList<>();
        dfs(data, result, "ICN");

        return result.toArray(new String[0]);
    }

    //테스트 1 〉	통과 (0.61ms, 73.7MB)
    //테스트 2 〉	통과 (0.44ms, 69.1MB)
    //테스트 3 〉	통과 (0.73ms, 72.9MB)
    //테스트 4 〉	통과 (0.64ms, 74.5MB)
}
