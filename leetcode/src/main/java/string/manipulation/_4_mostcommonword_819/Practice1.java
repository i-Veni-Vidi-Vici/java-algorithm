package string.manipulation._4_mostcommonword_819;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph =paragraph.toLowerCase().replaceAll("[^a-z\s]"," ");
        for (String s : banned) {
           paragraph=  paragraph.replace(s, "");
        }
        String[] value = paragraph.trim().split("\\s+");
        Map<String, Integer> result = new HashMap<>();
        for (String s : value) {
            result.put(s, result.getOrDefault(s, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        String maxValue = "";
        for (String s : result.keySet()) {
            if (max < result.get(s)) {
                max = result.get(s);
                maxValue = s;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        mostCommonWord("a, a, a, a, b,b,b,c, c", new String[]{"a"});
    }

    // 15ms
}
