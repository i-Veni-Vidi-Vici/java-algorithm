package string.manipulation.excel_sheet_column_number_171;

public class Solution1 {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        // 문자열의 각 문자를 순회
        for (char c : columnTitle.toCharArray()) {
            // 현재 결과에 26을 곱하고 (자릿수 이동)
            // 현재 문자의 값을 더함 (A=1, B=2, ...)
            result = result * 26 + (c - 'A' + 1);
        }

        return result;
    }
    // 1ms
}
