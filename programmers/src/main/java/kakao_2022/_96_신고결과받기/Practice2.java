package kakao_2022._96_신고결과받기;

import java.util.*;
public class Practice2 {
    public int[] solution(String[] id_list, String[] report, int k) {

        // 중복 제거 필요
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        // 0은 안들어감
        Map<String, List<String>> reports = new HashMap<>();
//         신고 리스트 만들기
        for(String value : reportSet){
            String[] person = value.split(" ");
            reports.putIfAbsent(person[1], new ArrayList<>());
            reports.get(person[1]).add(person[0]);
        }


        // 피신고자, 신고자 맵 생성
        Map<String, Integer> alarm = new HashMap<>();

        // 크기가 k번 이상시 정지, 메일 카운트 계산
        for(List<String> people : reports.values()){
            if(people.size()>=k){
                for(String name: people){
                    alarm.put(name, alarm.getOrDefault(name, 0)+1);
                }
            }
        }

        int[] result = new int[id_list.length];

        for(int i =0; i<id_list.length; i++){
            if(alarm.containsKey(id_list[i])){
                result[i] =alarm.get(id_list[i]);
            }
        }

        return result;
    }
    // 정확성  테스트
    // 테스트 1 〉	통과 (0.39ms, 73.7MB)
    //테스트 2 〉	통과 (0.40ms, 77.5MB)
    //테스트 3 〉	통과 (192.66ms, 179MB)
    //테스트 4 〉	통과 (0.49ms, 72.9MB)
    //테스트 5 〉	통과 (0.48ms, 79.6MB)
    //테스트 6 〉	통과 (3.91ms, 83.9MB)
    //테스트 7 〉	통과 (5.29ms, 83MB)
    //테스트 8 〉	통과 (6.58ms, 99.5MB)
    //테스트 9 〉	통과 (87.62ms, 128MB)
    //테스트 10 〉	통과 (88.77ms, 150MB)
    //테스트 11 〉	통과 (175.42ms, 151MB)
    //테스트 12 〉	통과 (1.50ms, 84.6MB)
    //테스트 13 〉	통과 (1.62ms, 78.6MB)
    //테스트 14 〉	통과 (117.21ms, 133MB)
    //테스트 15 〉	통과 (99.17ms, 151MB)
    //테스트 16 〉	통과 (0.89ms, 79.1MB)
    //테스트 17 〉	통과 (1.74ms, 83.6MB)
    //테스트 18 〉	통과 (2.43ms, 75.7MB)
    //테스트 19 〉	통과 (3.04ms, 81.3MB)
    //테스트 20 〉	통과 (75.14ms, 141MB)
    //테스트 21 〉	통과 (126.81ms, 159MB)
    //테스트 22 〉	통과 (0.27ms, 73.1MB)
    //테스트 23 〉	통과 (0.24ms, 79.2MB)
    //테스트 24 〉	통과 (0.21ms, 81.3MB)
    //채점 결과
    //정확성: 100.0
    //합계: 100.0 / 100.0
}
