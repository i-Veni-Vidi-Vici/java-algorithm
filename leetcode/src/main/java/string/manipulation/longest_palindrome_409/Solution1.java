package string.manipulation.longest_palindrome_409;

public class Solution1 {
    public int longestPalindrome(String s) {
        // 각 문자의 출현 횟수를 저장할 배열 (ASCII 코드 사용)
        int[] charCount = new int[128];

        // 1. 각 문자의 출현 횟수 세기
        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // 2. 팰린드롬 길이 계산
        for (int count : charCount) {
            // 짝수 개수는 모두 사용 가능
            length += count / 2 * 2;

            // 홀수 개수가 있는지 체크
            if (count % 2 == 1) {
                hasOdd = true;
            }
        }

        // 3. 홀수 개수가 있으면 가운데에 하나 추가 가능
        return hasOdd ? length + 1 : length;
    }
    // 1ms
}
