package string.manipulation._4_mostcommonword_819;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replaceAll("[^a-zA-Z]+", " ").toLowerCase().split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 1) + 1);
        }

        for (String s : banned) {
            wordCount.remove(s);
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
    // 11~12ms, 정규식 최적화로 인해,  if 문 제거됨
}
