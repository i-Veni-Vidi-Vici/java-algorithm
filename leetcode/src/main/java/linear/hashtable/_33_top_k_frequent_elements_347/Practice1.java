package linear.hashtable._33_top_k_frequent_elements_347;


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

public class Practice1 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Queue<Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());

        // 3단계: 해시맵의 엔트리를 우선순위 큐에 추가
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            queue.add(entry);
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = queue.poll().getKey();
        }

        return result;

    }

    // 13ms
}
