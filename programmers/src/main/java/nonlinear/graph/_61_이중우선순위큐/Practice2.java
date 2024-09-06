package nonlinear.graph._61_이중우선순위큐;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Practice2 {
    public int[] solution(String[] operations) {
        List<Integer> result =new LinkedList<>();

        for(String operation : operations){
            String[] value = operation.split(" ");
            if(value[0].equals("I")){
                result.add(Integer.parseInt(value[1]));
                Collections.sort(result);
            }
            if((result.size()>0) && value[0].equals("D") ){
                if(value[1].equals("1")){
                    result.remove(result.size()-1);
                } else if(value[1].equals("-1")){
                    result.remove(0);
                }
            }
        }
        if(result.isEmpty()){
            return new int[]{0,0};
        }

        return new int[]{result.get(result.size()-1), result.get(0)};
    }
    // 테스트 1 〉	통과 (0.73ms, 77MB)
    //테스트 2 〉	통과 (0.53ms, 76MB)
    //테스트 3 〉	통과 (0.82ms, 78.7MB)
    //테스트 4 〉	통과 (0.18ms, 76.9MB)
    //테스트 5 〉	통과 (0.58ms, 75.3MB)
    //테스트 6 〉	통과 (0.65ms, 79.2MB)
    //테스트 7 〉	통과 (386.65ms, 156MB)
    //테스트 8 〉	통과 (0.71ms, 67.1MB)
    //테스트 9 〉	통과 (0.67ms, 74.7MB)
    //테스트 10 〉	통과 (0.72ms, 68.7MB)
}
