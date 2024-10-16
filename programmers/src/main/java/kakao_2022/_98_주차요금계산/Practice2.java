package kakao_2022._98_주차요금계산;

import java.util.*;

public class Practice2 {
    public static int[] solution(int[] fees, String[] records) {
        Map<String, String> carLog = new HashMap<>();
        Map<String , Integer> sum = new HashMap<>();

        for(int i =0; i<records.length; i++){
            String[] value = records[i].split(" ");
            if(value[2].equals("IN")){
                carLog.put(value[1], value[0]);
            }else{
                String[] inTime = carLog.get(value[1]).split(":");
                String[] outTime = value[0].split(":");
                sum.put(value[1], sum.getOrDefault(value[1],0)+(Integer.parseInt(outTime[0])*60+Integer.parseInt(outTime[1]))-(Integer.parseInt(inTime[0])*60+Integer.parseInt(inTime[1])));
                carLog.remove(value[1]);
            }
        }

        for(String carNumber: carLog.keySet()){
            String[] inTime = carLog.get(carNumber).split(":");
            sum.put(carNumber, sum.getOrDefault(carNumber,0)+(23*60+59)-(Integer.parseInt(inTime[0])*60+Integer.parseInt(inTime[1])));
        }

        List<String> carNumbers = new ArrayList<>(sum.keySet());
        Collections.sort(carNumbers);

        List<Integer> result  = new ArrayList<>();
        for(String carNumber : carNumbers){
            result.add(fees[1] + (sum.get(carNumber) > fees[0] ? (((sum.get(carNumber) - fees[0]) / fees[2]
                    + (((sum.get(carNumber) - fees[0]) % fees[2]) > 0 ? 1 : 0)) * fees[3]) : 0));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        solution(new int[]{180, 5000, 10, 600}, new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"});
    }
    // 정확성  테스트
    //테스트 1 〉	통과 (2.54ms, 72MB)
    //테스트 2 〉	통과 (2.42ms, 76.8MB)
    //테스트 3 〉	통과 (3.56ms, 72.2MB)
    //테스트 4 〉	통과 (2.96ms, 74.6MB)
    //테스트 5 〉	통과 (3.11ms, 69.3MB)
    //테스트 6 〉	통과 (5.18ms, 71.7MB)
    //테스트 7 〉	통과 (19.63ms, 91.2MB)
    //테스트 8 〉	통과 (15.02ms, 78.1MB)
    //테스트 9 〉	통과 (3.73ms, 74.2MB)
    //테스트 10 〉	통과 (11.90ms, 83.6MB)
    //테스트 11 〉	통과 (12.71ms, 81.6MB)
    //테스트 12 〉	통과 (14.82ms, 79.9MB)
    //테스트 13 〉	통과 (2.55ms, 67MB)
    //테스트 14 〉	통과 (7.07ms, 78.1MB)
    //테스트 15 〉	통과 (2.27ms, 76.9MB)
    //테스트 16 〉	통과 (3.27ms, 76.1MB)
    //채점 결과
    //정확성: 100.0
    //합계: 100.0 / 100.0
}
