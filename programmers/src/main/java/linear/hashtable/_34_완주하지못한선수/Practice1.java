package linear.hashtable._34_완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Boolean> value = new HashMap<>();

        for (String  s: completion) {
            value.put(s, true);
        }
        for (String s : participant) {
            if (!value.containsKey(s)) {
                return s;
            }
        }

        return null;
    }
    // 효율성  테스트
    //테스트 1 〉	통과 (34.70ms, 82.6MB)
    //테스트 2 〉	통과 (68.00ms, 88.1MB)
    //테스트 3 〉	통과 (98.86ms, 96.7MB)
    //테스트 4 〉	통과 (73.79ms, 95.4MB)
    //테스트 5 〉	통과 (71.80ms, 115MB)
}
