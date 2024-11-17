package string.manipulation.first_unique_character_in_a_string_387;

public class Solution1 {
    public int firstUniqChar(String s) {
        // 알파벳 소문자의 빈도를 저장할 배열 (26개)
        int[] freq = new int[26];

        // 각 문자의 빈도 계산
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // 문자열을 다시 순회하면서 빈도가 1인 첫 번째 문자의 인덱스 찾기
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // 중복되지 않는 문자가 없는 경우
        return -1;
    }
}
