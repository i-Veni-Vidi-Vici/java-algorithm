package sort._65_merge_intervals_56;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice1 {
    public int[][] merge(int[][] intervals) {
        List<int[]> values = new ArrayList<>();
        Collections.addAll(values, intervals);
        values.sort(Comparator.comparingInt(o -> o[0]));

        for (int i = 0; i < values.size(); i++) {
            int count =0;

            for (int j = i+1; j < values.size(); j++) {
                if (values.get(i)[1] >= values.get(j)[0]) {
                    values.get(i)[1] = Math.max(values.get(i)[1], values.get(j)[1]);
                    count++;
                } else {
                    for (int k = 0; k < count; k++) {
                        values.remove(i+1);
                    }
                    break;
                }
                if (j==values.size()-1) {
                    for (int k = 0; k < count; k++) {
                        values.remove(i+1);
                    }
                    break;
                }
            }
        }

        return values.toArray(new int[0][]);
    }

    // 13ms
}
