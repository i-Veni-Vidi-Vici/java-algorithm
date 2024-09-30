package greedy._86_task_scheduler_621;

import java.util.PriorityQueue;
import java.util.Queue;

public class Practice1 {
    public int leastInterval(char[] tasks, int n) {
        int[] value = new int[26];

        for(int i=0; i<tasks.length; i++){
            value[tasks[i]-'A']+=1;
        }
        Queue<Integer> queue = new PriorityQueue<>((a, b)-> b-a);
        for(int i=0; i<value.length; i++){
            if(value[i]>0)
                queue.add(value[i]);
        }

        while(!queue.isEmpty()){

        }
        return 0;
    }
}
