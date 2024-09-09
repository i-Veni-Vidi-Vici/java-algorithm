package sort._65_merge_intervals_56;

import java.util.Arrays;

public class Practice2 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2)-> o1[0]-o2[0]);

        int count =0;
        for(int i=0; i<intervals.length-1; i++){
            if(intervals[i][1] >= intervals[i+1][0]){
                if(intervals[i][1] < intervals[i+1][1]){
                    intervals[i+1][0] = intervals[i][0];
                    intervals[i+1][1] = intervals[i+1][1];
                } else {
                    intervals[i+1][0] = intervals[i][0];
                    intervals[i+1][1] = intervals[i][1];
                }
                intervals[i][0] =-1;
                count++;
            }
        }

        int[][] result = new int[intervals.length-count][2];

        int index= 0;
        for(int i=0; i<intervals.length; i++){
            if(intervals[i][0] != -1){
                result[index][0] = intervals[i][0];
                result[index++][1] = intervals[i][1];
            }
        }

        return result;
    }

    // 8ms
}
