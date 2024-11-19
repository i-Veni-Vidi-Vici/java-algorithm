package string.manipulation.find_the_difference_389;

public class Solution1 {
    public char findTheDifference(String s, String t) {
        char result = 0;

        // 문자열 s의 모든 문자에 대해 XOR 연산
        for (char c : s.toCharArray()) {
            result ^= c;
        }

        // 문자열 t의 모든 문자에 대해 XOR 연산
        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }
    // 1ms
}
