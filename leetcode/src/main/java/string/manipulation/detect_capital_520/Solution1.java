package string.manipulation.detect_capital_520;

public class Solution1 {
    public boolean detectCapitalUse(String word) {
        // 단어 길이가 1이면 무조건 올바른 사용
        if (word.length() <= 1) {
            return true;
        }

        // 첫 번째와 두 번째 문자의 대문자 여부 확인
        boolean firstIsUpper = Character.isUpperCase(word.charAt(0));
        boolean secondIsUpper = Character.isUpperCase(word.charAt(1));

        // 첫 번째가 소문자인데 두 번째가 대문자면 false
        if (!firstIsUpper && secondIsUpper) {
            return false;
        }

        // 나머지 문자들 검사
        boolean expectUpper = firstIsUpper && secondIsUpper;
        for (int i = 2; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)) != expectUpper) {
                return false;
            }
        }

        return true;
    }

    // 0ms
}
