package greedy._86_task_scheduler_621;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int result = 0;
        for (char task : tasks) {
            map.putIfAbsent(task, 0);
            map.put(task, map.get(task) + 1);
        }

        while (map.size() != set.size()) {
            int count = 0;

            for (Character c : map.keySet()) {
                if (count < n) {
                    if (map.get(c) == 0) {
                        result++;
                        count++;
                        set.add(c);
                        continue;
                    }
                    map.put(c, map.get(c) - 1);
                    result++;
                    count++;
                } else {
                    break;
                }
            }
            result++;

            if (count < n) {
                result += n - count;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        leastInterval(new char[]{'A','C','A','B','D','B'}, 1);
    }
    // error
}
