package kakao_2022._98_주차요금계산;

import java.util.*;

public class Solution1 {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parkingLogs = new HashMap<>();  // 출입 내역
        Map<String, Integer> parkingTimes = new HashMap<>(); // 누적 주차 시간

        // 누적 주차 시간 계산
        for (String record : records) {
            String[] log = record.split(" ");
            String[] time = log[0].split(":");
            if (log[2].equals("IN")) {
                parkingLogs.put(log[1],
                        Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]));
            } else {
                // 출차일 때 분 단위로 시간을 계산하고 기존에 시간이 있다면 누적
                int elapsedTime =
                        Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]) - parkingLogs.get(log[1]);
                parkingTimes.put(log[1], parkingTimes.getOrDefault(log[1], 0) + elapsedTime);
                parkingLogs.remove(log[1]);
            }
        }

        // 남아 있는 내역은 23:59로 계산
        for (Map.Entry<String, Integer> parkingLog : parkingLogs.entrySet()) {
            parkingTimes.put(parkingLog.getKey(),
                    parkingTimes.getOrDefault(parkingLog.getKey(), 0) +
                            23 * 60 + 59 - parkingLog.getValue());
        }

        // 키만 추출하여 정수형 기준으로 정렬
        List<String> parkingTimesByKey = new ArrayList<>(parkingTimes.keySet());
        parkingTimesByKey.sort(Comparator.comparingInt(Integer::parseInt));

        // 정렬 키 기준으로 비용 계산하여 정답 구성
        int[] answer = new int[parkingTimesByKey.size()];
        int i = 0;
        for (String k : parkingTimesByKey) {
            int fee;
            // 기본 시간 이내인 경우 기본 요금
            if (parkingTimes.get(k) <= fees[0]) {
                fee = fees[1];
            } else {
                // 초과분은 단위 시간당 단위 요금으로 계산
                fee = fees[1] +
                        (int) Math.ceil((float) (parkingTimes.get(k) - fees[0]) / fees[2]) * fees[3];
            }
            answer[i] = fee;
            i++;
        }

        return answer;
    }
    // 정확성  테스트
    //테스트 1 〉	통과 (3.23ms, 66.6MB)
    //테스트 2 〉	통과 (3.04ms, 77.1MB)
    //테스트 3 〉	통과 (3.23ms, 76MB)
    //테스트 4 〉	통과 (3.76ms, 73.4MB)
    //테스트 5 〉	통과 (3.51ms, 78.2MB)
    //테스트 6 〉	통과 (11.04ms, 78.7MB)
    //테스트 7 〉	통과 (15.36ms, 86.6MB)
    //테스트 8 〉	통과 (11.87ms, 83.7MB)
    //테스트 9 〉	통과 (5.06ms, 69.5MB)
    //테스트 10 〉	통과 (11.68ms, 82.9MB)
    //테스트 11 〉	통과 (16.21ms, 83.7MB)
    //테스트 12 〉	통과 (15.07ms, 85.5MB)
    //테스트 13 〉	통과 (2.64ms, 79.9MB)
    //테스트 14 〉	통과 (2.72ms, 73.2MB)
    //테스트 15 〉	통과 (2.05ms, 74.6MB)
    //테스트 16 〉	통과 (2.76ms, 84.1MB)
    //채점 결과
    //정확성: 100.0
    //합계: 100.0 / 100.0
}
