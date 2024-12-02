package string.manipulation.reverse_words_in_a_string_iii_557;

public class Solution1 {
    public String reverseWords(String s) {
        // 문자열을 단어 단위로 분리
        String[] words = s.split(" ");

        // 각 단어를 뒤집기 위한 StringBuilder
        StringBuilder result = new StringBuilder();

        // 각 단어를 순회하며 뒤집기
        for (int i = 0; i < words.length; i++) {
            // 각 단어를 뒤집기
            StringBuilder reversedWord = new StringBuilder(words[i]).reverse();

            // 결과 문자열에 추가
            result.append(reversedWord);

            // 마지막 단어가 아니라면 공백 추가
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
    // 4ms
}
