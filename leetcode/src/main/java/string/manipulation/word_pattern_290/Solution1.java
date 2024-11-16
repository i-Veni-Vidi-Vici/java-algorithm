package string.manipulation.word_pattern_290;

import java.util.HashMap;

public class Solution1 {
    public boolean wordPattern(String pattern, String s) {
        // 공백으로 문자열 s를 단어들로 분리
        String[] words = s.split(" ");

        // pattern의 길이와 단어 개수가 다르면 false
        if (pattern.length() != words.length) {
            return false;
        }

        // 문자->단어, 단어->문자 매핑을 저장할 HashMap 두 개 생성
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        // 각 위치의 문자와 단어를 확인
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // 문자->단어 매핑 확인
            if (!charToWord.containsKey(c)) {
                // 새로운 문자인데 해당 단어가 이미 다른 문자에 매핑되어 있는 경우
                if (wordToChar.containsKey(word)) {
                    return false;
                }
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
            // 이미 매핑된 문자인 경우, 기존 매핑과 일치하는지 확인
            else if (!charToWord.get(c).equals(word)) {
                return false;
            }
        }

        return true;
    }
    // 0ms
}
