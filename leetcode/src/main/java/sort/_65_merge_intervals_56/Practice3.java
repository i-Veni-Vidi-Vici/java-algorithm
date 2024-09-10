package sort._65_merge_intervals_56;

import java.util.*;
public class Practice3 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2)-> o1[0]-o2[0]);

        List<int[]> result  = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            if(!result.isEmpty() && result.get(result.size()-1)[1] >= intervals[i][0] ){
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1], intervals[i][1]);
            }else{
                result.add(intervals[i]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
    // 8ms
}
