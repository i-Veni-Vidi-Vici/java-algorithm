package dynamicprogramming._397;

import java.util.*;

public class Practice1_1 {
    public int integerReplacement(int n) {
        if(n==1){
            return 0;
        }
        Queue<Long> queue = new ArrayDeque<>();
        queue.add((long)n);
        int count =0;
        int size =1;
        while(!queue.isEmpty()){

            while(size>0){
                long val =queue.poll();
                if(val==2){
                    return count+1;
                }
                if(val%2==0){
                    queue.add(val/2);
                }else{
                    queue.add(val+1);
                    queue.add(val-1);
                }
                size--;
            }

            size = queue.size();


            count++;
        }

        return count;
    }
    // 14ms
}
