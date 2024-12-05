package string.manipulation.valid_palidrome_ii_680;

public class Solution1 {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        // 양쪽에서 중앙으로 이동하며 비교
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // 문자가 다른 경우, 왼쪽 또는 오른쪽 문자를 제거해보고 확인
                return isPalindrome(s, left + 1, right) ||
                        isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    // 주어진 범위 내에서 팰린드롬인지 확인하는 헬퍼 메서드
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 4ms
}
