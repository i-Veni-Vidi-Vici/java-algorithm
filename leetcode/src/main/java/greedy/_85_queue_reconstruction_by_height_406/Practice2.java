package greedy._85_queue_reconstruction_by_height_406;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Practice2 {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> result = new LinkedList<>();
        Arrays.sort(people, (o1, o2) -> {
            if(o1[1]== o2[1]){
                return o2[0]-o1[0];
            } else{
                return o1[1]-o2[1];
            }
        });


        for(int i=0; i<people.length; i++){
            result.add(people[i][1], people[i]);
        }

        return result.toArray(new int[0][]);
    }

    // Wrong Answer
}
