package string.manipulation.mostcommonword819;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replaceAll("[^a-zA-Z\s]", " ").toLowerCase().split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isBlank()) {
                wordCount.put(word, wordCount.getOrDefault(word, 1) + 1);
            }
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

    // 15ms
}
