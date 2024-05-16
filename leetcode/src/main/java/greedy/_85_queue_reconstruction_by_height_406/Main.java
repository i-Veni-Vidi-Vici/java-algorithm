package greedy._85_queue_reconstruction_by_height_406;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> results = new ArrayList<>();
        results.add(people[0]);
        for (int i = 0; i < people.length; i++) {

            int index = 0;
            for (int j = 0; j < results.size(); j++) {
                if (results.get(j)[1] < people[i][1]) {
                    index++;
                    if (results.get(j + 1)[1] >= people[i][1]) {
                        break;
                    }
                } else if (results.get(j)[1] == people[i][1]) {
                    if (results.get(j)[0] < people[i][0]) {
                        index++;
                        if (results.get(j + 1)[1] != people[i][1]) {
                            break;
                        }
                    }
                } else if (results.get(j)[1] > people[i][1]) {

                }
            }

        }

        return null;
    }
    // error
}
