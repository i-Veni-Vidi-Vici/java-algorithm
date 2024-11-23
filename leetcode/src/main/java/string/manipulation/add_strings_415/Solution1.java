package string.manipulation.add_strings_415;

public class Solution1 {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;  // 첫 번째 숫자의 마지막 자리
        int j = num2.length() - 1;  // 두 번째 숫자의 마지막 자리
        int carry = 0;  // 올림수

        // 두 숫자 중 하나라도 처리할 자리가 남아있거나 올림수가 있는 동안 계속
        while (i >= 0 || j >= 0 || carry > 0) {
            // 현재 자리의 숫자들을 가져옴 (없으면 0으로 처리)
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;

            // 현재 자리의 합 계산
            int sum = digit1 + digit2 + carry;

            // 결과 문자열의 앞에 현재 자리의 값을 추가
            result.insert(0, sum % 10);

            // 올림수 계산
            carry = sum / 10;

            // 인덱스 이동
            i--;
            j--;
        }

        return result.toString();
    }
    // 4ms
}
