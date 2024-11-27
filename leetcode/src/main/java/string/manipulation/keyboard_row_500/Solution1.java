package string.manipulation.keyboard_row_500;

import java.util.*;
public class Solution1 {
    public String[] findWords(String[] words) {
        // 각 키보드 행을 문자열로 정의
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        // 결과를 저장할 ArrayList 생성
        List<String> result = new ArrayList<>();

        // 각 단어에 대해 검사
        for (String word : words) {
            // 단어를 소문자로 변환
            String lowerWord = word.toLowerCase();

            // 단어의 첫 문자가 어느 행에 속하는지 확인
            int rowNum = 0;
            char firstChar = lowerWord.charAt(0);

            if (row1.contains(String.valueOf(firstChar))) {
                rowNum = 1;
            } else if (row2.contains(String.valueOf(firstChar))) {
                rowNum = 2;
            } else if (row3.contains(String.valueOf(firstChar))) {
                rowNum = 3;
            }

            boolean sameRow = true;
            // 단어의 나머지 문자들이 같은 행에 있는지 확인
            for (char c : lowerWord.toCharArray()) {
                if ((rowNum == 1 && !row1.contains(String.valueOf(c))) ||
                        (rowNum == 2 && !row2.contains(String.valueOf(c))) ||
                        (rowNum == 3 && !row3.contains(String.valueOf(c)))) {
                    sameRow = false;
                    break;
                }
            }

            // 모든 문자가 같은 행에 있다면 결과에 추가
            if (sameRow) {
                result.add(word);
            }
        }

        // ArrayList를 배열로 변환하여 반환
        return result.toArray(new String[0]);
    }
    // 0ms
}
