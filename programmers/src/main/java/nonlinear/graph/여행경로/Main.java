package nonlinear.graph.여행경로;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {

    public void dfs(Map<String, PriorityQueue<String>> map, List<String> result, String start) {
        while (map.containsKey(start) && !map.get(start).isEmpty()) {
            dfs(map, result, map.get(start).poll());
        }

        result.add(0, start);
    }

    public String[] solution(String[][] tickets) {

        List<String> result = new LinkedList<>();
        Map<String, PriorityQueue<String>> map = new HashMap<>();

        for (String[] ticket : tickets) {
            map.putIfAbsent(ticket[0], new PriorityQueue<>());
            map.get(ticket[0]).add(ticket[1]);
        }

        dfs(map,result,"ICN");

        return result.toArray(new String[0]);
    }
}
// 채점 결과
//정확성: 100.0
//합계: 100.0 / 100.0
