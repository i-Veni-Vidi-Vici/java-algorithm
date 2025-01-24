package dynamicprogramming._435;

import java.util.*;

public class Solution1 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        // 끝나는 시간을 기준으로 정렬
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;          // 제거해야 할 구간의 수
        int prevEnd = intervals[0][1];  // 이전 구간의 끝점

        // 두 번째 구간부터 순회
        for (int i = 1; i < intervals.length; i++) {
            // 현재 구간의 시작점이 이전 구간의 끝점보다 작으면 겹침
            if (intervals[i][0] < prevEnd) {
                count++;  // 겹치는 구간 제거
            } else {
                prevEnd = intervals[i][1];  // 겹치지 않으면 현재 구간을 선택
            }
        }

        return count;
    }
    // 43
}
