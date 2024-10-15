package kakao_2022._98_주차요금계산;

import java.util.*;



public class Practice1 {
    public  static  int[] solution(int[] fees, String[] records) {
        // 정렬 1차 차량번호 2차 시각으로
        Arrays.sort(records, (o1, o2)->{
            String[] car1 = o1.split(" ");
            String[] car2 = o2.split(" ");

            if(car1[1].equals(car2[1])){

                return Integer.parseInt(car1[0].replace(":", "")) -Integer.parseInt(car2[0].replace(":", ""));
            }

            return Integer.parseInt(car1[1])- Integer.parseInt(car2[1]);
        });
        List<Integer> result =new ArrayList<>();
        String prev =records[0].substring(6,10);
        int sum =0;
        for(int i=0; i<records.length-1;){

            if(records[i].substring(6,10).equals(records[i+1].substring(6,10))){
                if(!prev.equals(records[i].substring(6,10))){
                    result.add(fees[1]+ (sum>fees[0]? (((sum-fees[0])/fees[2] + ((sum-fees[0])%fees[2]>0?1:0))*fees[3]):0));
                    sum =0;
                }
                String[] time1 = records[i].substring(0,5).split(":");
                String[] time2 = records[i+1].substring(0,5).split(":");
                int time = (Integer.parseInt(time2[0])*60+ Integer.parseInt(time2[1])) -
                        (Integer.parseInt(time1[0])*60+ Integer.parseInt(time1[1]));
                sum += time;
                prev = records[i].substring(6,10);
                i+=2;
            } else{
                String[] time1 = records[i].substring(0,5).split(":");
                sum += (23*60+ 59) -
                        (Integer.parseInt(time1[0])*60+ Integer.parseInt(time1[1]));
                i++;

            }
        }

        if(records[records.length-1].split(" ")[2].equals("IN")){
            String[] time1 = records[records.length-1].substring(0,5).split(":");
            sum += (23*60+ 59) -
                    (Integer.parseInt(time1[0])*60+ Integer.parseInt(time1[1]));
        }
        result.add(fees[1]+ (sum>fees[0]? (((sum-fees[0])/fees[2] + ((sum-fees[0])%fees[2]>0?1:0))*fees[3]):0));

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        solution(new int[]{180, 5000, 10, 600}, new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"});
    }
    // 정확성  테스트
    //테스트 1 〉	실패 (2.57ms, 74.5MB)
    //테스트 2 〉	통과 (2.43ms, 73MB)
    //테스트 3 〉	통과 (3.39ms, 76MB)
    //테스트 4 〉	실패 (4.58ms, 74.5MB)
    //테스트 5 〉	실패 (6.25ms, 77.9MB)
    //테스트 6 〉	실패 (13.12ms, 77.8MB)
    //테스트 7 〉	실패 (39.11ms, 100MB)
    //테스트 8 〉	통과 (22.11ms, 96.7MB)
    //테스트 9 〉	실패 (5.77ms, 89MB)
    //테스트 10 〉	실패 (22.71ms, 95.7MB)
    //테스트 11 〉	실패 (20.41ms, 91.2MB)
    //테스트 12 〉	실패 (17.44ms, 90.5MB)
    //테스트 13 〉	통과 (3.06ms, 69.4MB)
    //테스트 14 〉	통과 (3.78ms, 80.9MB)
    //테스트 15 〉	통과 (3.37ms, 75.7MB)
    //테스트 16 〉	통과 (2.82ms, 72.5MB)
    //채점 결과
    //정확성: 43.8
    //합계: 43.8 / 100.0
}
