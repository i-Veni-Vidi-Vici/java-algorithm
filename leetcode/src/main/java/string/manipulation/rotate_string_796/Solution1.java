package string.manipulation.rotate_string_796;

public class Solution1 {
    public boolean rotateString(String s, String goal) {
        // 두 문자열의 길이가 다르면 회전해도 같을 수 없음
        if (s.length() != goal.length()) {
            return false;
        }

        // s를 두 번 이어붙이면 모든 회전 가능한 경우가 포함됨
        // 예: s="abcde"이면 s+s="abcdeabcde"는 모든 회전 케이스를 포함
        String doubleS = s + s;

        // goal이 doubleS의 부분 문자열인지 확인
        return doubleS.contains(goal);
    }
    // 0ms
}
