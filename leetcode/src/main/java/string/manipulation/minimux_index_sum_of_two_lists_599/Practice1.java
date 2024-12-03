package string.manipulation.minimux_index_sum_of_two_lists_599;

import java.util.*;

public class Practice1 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, List<Integer>> result = new HashMap<>();

        for(int i=0; i<list1.length; i++){
            List<Integer> val = new ArrayList<>();
            val.add(i);
            result.put(list1[i], val);
        }
        for(int i=0; i<list2.length; i++){
            if(result.containsKey(list2[i])){
                result.get(list2[i]).add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        List<String> output = new ArrayList<>();
        for(List<Integer> value : result.values()){
            if(value.size()==2){
                min = Math.min(min, value.get(0)+ value.get(1));
            }
        }

        for(String key : result.keySet()){
            if(result.get(key).size()==2){
                if(min == result.get(key).get(0)+ result.get(key).get(1) ){
                    output.add(key);
                }

            }
        }
        return output.toArray(new String[0]);
    }

    // 16ms
}
