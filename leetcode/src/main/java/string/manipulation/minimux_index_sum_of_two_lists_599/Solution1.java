package string.manipulation.minimux_index_sum_of_two_lists_599;

import java.util.*;

public class Solution1 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        // list1의 문자열과 인덱스를 저장할 HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // list1의 문자열과 인덱스를 HashMap에 저장
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        // 최소 인덱스 합을 가진 문자열들을 저장할 List
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        // list2를 순회하면서 공통 문자열 찾기
        for (int j = 0; j < list2.length; j++) {
            // list1에도 있는 문자열인 경우
            if (map.containsKey(list2[j])) {
                int sum = j + map.get(list2[j]); // 인덱스 합 계산

                // 새로운 최소 인덱스 합을 찾은 경우
                if (sum < minSum) {
                    result.clear(); // 기존 결과 삭제
                    result.add(list2[j]);
                    minSum = sum;
                }
                // 현재 최소 인덱스 합과 같은 경우
                else if (sum == minSum) {
                    result.add(list2[j]);
                }
            }
        }

        // List를 배열로 변환하여 반환
        return result.toArray(new String[result.size()]);
    }
}
