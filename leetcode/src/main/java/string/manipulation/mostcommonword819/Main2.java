package string.manipulation.mostcommonword819;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main2 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replaceAll("[^a-zA-Z]+", " ").toLowerCase().split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

//        List<String> ban = Arrays.asList(banned); //11~12ms
//        List<String> ban = List.of(banned); //11~12ms
        Set<String> ban = new HashSet<>(Arrays.asList(banned)); // 10ms 11ms

        for (String word : words) {
            if (!ban.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 1) + 1);
            }
        }

        int max = 0;
        String value = "";
        for (String s : wordCount.keySet()) {
            if (max < wordCount.get(s)) {
                max = wordCount.get(s);
                value = s;
            }
        }

        return value;
    }

// 10~11ms, remove 제거로 큰 차이는 없음
}
