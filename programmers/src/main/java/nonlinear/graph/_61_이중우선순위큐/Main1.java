package nonlinear.graph._61_이중우선순위큐;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public int[] solution(String[] operations) {
        List<Integer> list = new ArrayList<>();

        for (String operation : operations) {
            String[] s = operation.split(" ");
            if (s[0].equals("I")) {
                list.add(Integer.parseInt(s[1]));
            } else {
                if (!list.isEmpty()) {
                    if (s[1].equals("-1")) {
                        list.remove(Collections.min(list));
                    } else if (s[1].equals("1")) {
                        list.remove(Collections.max(list));
                    }
                }
            }
        }
        if (list.isEmpty()) {
            return new int[]{0, 0};
        }

        return new int[]{Collections.max(list), Collections.min(list)};
    }

    // 정확성  테스트
    //테스트 1 〉	통과 (0.20ms, 65.4MB)
    //테스트 2 〉	통과 (0.13ms, 83.2MB)
    //테스트 3 〉	통과 (0.24ms, 78.9MB)
    //테스트 4 〉	통과 (0.10ms, 65.8MB)
    //테스트 5 〉	통과 (0.16ms, 73.5MB)
    //테스트 6 〉	통과 (0.22ms, 71MB)
}
