package sort._65_merge_intervals_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main1 {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        if (intervals.length == 1) {
            return intervals;
        }
        List<List<Integer>> result = new ArrayList<>();

        int j=0;
        for (int i = 0; i < intervals.length-1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
                result.add(Arrays.asList(intervals[i][0], Math.max(intervals[i + 1][1],intervals[i][1])));
                j++;
            } else {
                result.add(Arrays.asList(intervals[j][0], intervals[j][1]));
            }
            j++;

        }
        if (j == intervals.length - 1) {
            result.add(Arrays.asList(intervals[j][0], intervals[j][1]));
        }

        return convertToArray(result);
    }

    public static int[][] convertToArray(List<List<Integer>> listOfLists) {
        int[][] array = new int[listOfLists.size()][];
        for (int i = 0; i < listOfLists.size(); i++) {
            List<Integer> innerList = listOfLists.get(i);
            array[i] = new int[innerList.size()];
            for (int j = 0; j < innerList.size(); j++) {
                array[i][j] = innerList.get(j);
            }
        }
        return array;
    }
    // error
}
