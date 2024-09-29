package greedy._85_queue_reconstruction_by_height_406;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Practice3 {
    public int[][] reconstructQueue(int[][] people) {
        Queue<int[]> queue = new PriorityQueue<>((o1, o2)->{
            if(o1[0]!=o2[0]){
                return o2[0]-o1[0];
            }
            else{
                return o2[1]-o1[1];
            }
        });

        for(int[] val: people){
            queue.add(val);
        }
        List<int[]> result = new LinkedList<>();
        while(!queue.isEmpty()){
            int[] value = queue.poll();
            if(result.size()-1>= value[1])
                result.add(value[1],value);
            else  result.add(value);
        }

        return result.toArray(new int [0][]);
    }
    // error
}

