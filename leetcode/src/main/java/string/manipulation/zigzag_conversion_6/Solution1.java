package string.manipulation.zigzag_conversion_6;

public class Solution1 {
    public String convert(String s, int numRows) {
        // 1. 특수한 경우 처리
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // 2. 각 행을 저장할 StringBuilder 배열 생성
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // 3. 현재 방향과 현재 행을 추적
        int currentRow = 0;
        boolean goingDown = false;

        // 4. 각 문자를 적절한 행에 추가
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // 방향을 바꿔야 하는지 체크
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // 다음 행으로 이동
            currentRow += goingDown ? 1 : -1;
        }

        // 5. 모든 행을 하나의 문자열로 합치기
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
    // 4ms
}
