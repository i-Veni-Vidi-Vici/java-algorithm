package string.manipulation.number_of_segments_in_a_string_434;

public class Solution1 {
    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // 현재 문자가 공백이 아니고, 이전 문자가 공백이거나 첫 문자인 경우
            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
    // 0ms
}
