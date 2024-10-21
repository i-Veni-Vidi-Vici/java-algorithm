package dynamicprogramming.pascals_triangle_118;

import java.util.*;
public class Practice1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows== 1){
            result.add(Arrays.asList(1));
            return result;
        }
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1,1));


        for(int i=2; i<numRows; i++){
            List<Integer> value = new ArrayList<>();
            value.add(1);
            value.add(1);
            List<Integer> prev = result.get(i-1);
            for(int j=0; j<prev.size()-1; j++){
                value.add(1,prev.get(j)+ prev.get(j+1));
            }
            result.add(value);
        }

        return result;
    }
    // 1ms
}
