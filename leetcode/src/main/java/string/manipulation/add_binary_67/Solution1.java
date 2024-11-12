package string.manipulation.add_binary_67;

public class Solution1 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;    // a의 마지막 인덱스
        int j = b.length() - 1;    // b의 마지막 인덱스
        int carry = 0;             // 올림수

        // 두 문자열 중 하나라도 처리할 숫자가 남아있거나 carry가 있는 경우 계속 진행
        while (i >= 0 || j >= 0 || carry > 0) {
            // 현재 자리의 a의 숫자 가져오기 (없으면 0)
            int digitA = i >= 0 ? a.charAt(i) - '0' : 0;
            // 현재 자리의 b의 숫자 가져오기 (없으면 0)
            int digitB = j >= 0 ? b.charAt(j) - '0' : 0;

            // 현재 자리의 합 계산
            int sum = digitA + digitB + carry;
            // 결과 문자열에 추가 (0 또는 1)
            result.insert(0, sum % 2);
            // 다음 자리로 넘어갈 올림수 계산
            carry = sum / 2;

            // 인덱스 이동
            i--;
            j--;
        }

        return result.toString();
    }
    // 2ms
}
