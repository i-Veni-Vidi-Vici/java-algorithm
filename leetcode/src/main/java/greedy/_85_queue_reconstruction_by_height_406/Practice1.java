package greedy._85_queue_reconstruction_by_height_406;

import java.util.LinkedList;
import java.util.List;

public class Practice1 {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> result = new LinkedList<>();
        result.add(people[0]);
        for (int i = 1; i < people.length; i++) {
            for (int[] ints : result) {
                if (ints[0] > people[i][0]) {
                    if (ints[1] < people[i][1]) {
//                        re
                    }
                }
            }
        }

        return null;
    }

    // error
}
