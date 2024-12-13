package dynamicprogramming.pascals_triangle_ii_119;

import java.util.*;

public class Practice1 {
    public List<Integer> getRow(int rowIndex) {
        if( rowIndex ==0){
            return List.of(1);
        }
        if( rowIndex ==1){
            return List.of(1,1);
        }

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(1);

        int current = 1;
        List<Integer> result = new ArrayList<>();
        int a =1;
        int b =1;
        while(current <rowIndex){


            int c = queue.poll();
            if(c==1 && !queue.isEmpty()){
                result.add(1);
                a=1;
                b = queue.poll();
            }
            else{
                a=b;
                b = c;
            }

            result.add(a+b);

            if(queue.isEmpty()){
                current ++;
                result.add(1);
                if(current <rowIndex){

                    queue.addAll(result);
                }else return result;

                result.clear();
            }

        }

        return result;

    }
    // 2ms
}
