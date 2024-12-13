package dynamicprogramming.pascals_triangle_ii_119;

import java.util.*;

public class Solution1 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        // 첫 번째 원소는 항상 1
        result.add(1);

        // rowIndex가 0이면 바로 반환
        if (rowIndex == 0) {
            return result;
        }

        // 각 행을 계산
        for (int i = 0; i < rowIndex; i++) {
            // 새로운 행을 저장할 임시 리스트
            List<Integer> temp = new ArrayList<>();
            temp.add(1);  // 첫 번째는 항상 1

            // 이전 행의 두 수를 더해서 현재 행의 중간 값들을 계산
            for (int j = 0; j < result.size() - 1; j++) {
                temp.add(result.get(j) + result.get(j + 1));
            }

            temp.add(1);  // 마지막은 항상 1
            result = temp;  // 결과 업데이트
        }

        return result;
    }
    // 1ms
}
