package nonlinear.graph._61_이중우선순위큐;

import java.util.*;

public class Practice3 {

    public int[] solution(String[] operations) {
        Queue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2-o1);
        Queue<Integer> minHeap = new PriorityQueue<>();

        for(String operation : operations){
            String[] value = operation.split(" ");
            if(value[0].equals("I")){
                maxHeap.add(Integer.parseInt(value[1]));
                minHeap.add(Integer.parseInt(value[1]));
            }
            else if(value[0].equals("D")){
                if(value[1].equals("1")){
                    minHeap.remove(maxHeap.poll());
                } else if(value[1].equals("-1")){
                    maxHeap.remove(minHeap.poll());
                }
            }
        }

        if(maxHeap.isEmpty()){
            return new int[]{0,0};
        }

        return new int[]{maxHeap.poll(), minHeap.poll()};
    }
    // 테스트 1 〉	통과 (0.67ms, 77MB)
    //테스트 2 〉	통과 (0.65ms, 77.9MB)
    //테스트 3 〉	통과 (1.10ms, 76.3MB)
    //테스트 4 〉	통과 (0.73ms, 74.3MB)
    //테스트 5 〉	통과 (0.94ms, 73.6MB)
    //테스트 6 〉	통과 (0.73ms, 67.5MB)
    //테스트 7 〉	통과 (69.75ms, 127MB)
    //테스트 8 〉	통과 (0.75ms, 76MB)
    //테스트 9 〉	통과 (0.74ms, 73.6MB)
    //테스트 10 〉	통과 (0.74ms, 79.2MB)
}
