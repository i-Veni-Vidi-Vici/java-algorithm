package sort._72_intersection_of_two_arrays_349;

import java.util.ArrayList;
import java.util.List;

public class Practice3 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result=  new ArrayList<>();
        int[] values = new int[1001];

        for(int num: nums1){
            values[num]++;
        }
        for(int num: nums2){
            if(values[num]>=1){
                result.add(num);
                values[num]=0;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    // 3ms
}
