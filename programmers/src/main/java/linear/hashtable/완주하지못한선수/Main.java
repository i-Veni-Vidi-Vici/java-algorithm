package linear.hashtable.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            if (map.get(s) == 1) {
                map.remove(s);
            } else {
                map.put(s, map.get(s) - 1);
            }
        }

        for (String s : map.keySet()) {
            answer = s;
        }

        return answer;
    }
}
//채점 결과
//정확성: 58.3
//효율성: 41.7
//합계: 100.0 / 100.0