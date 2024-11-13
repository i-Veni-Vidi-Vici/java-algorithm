package string.manipulation.excel_sheet_column_title_168;

public class Solution1 {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            // 1을 빼주는 이유는 A가 1부터 시작하기 때문
            columnNumber--;

            // 현재 자릿수의 문자를 구함 (0 -> A, 1 -> B, ..., 25 -> Z)
            char currentChar = (char) ('A' + columnNumber % 26);
            result.insert(0, currentChar);

            columnNumber /= 26;
        }

        return result.toString();
    }
    // 0ms
}
