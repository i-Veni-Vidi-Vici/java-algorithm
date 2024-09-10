package sort._67_largest_number_179;

import java.util.Arrays;

public class Practice3 {
    public String largestNumber(int[] nums) {
        String[] values =new String[nums.length];
        for(int i=0; i<nums.length; i++){
            values[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(values, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        if(values[0].equals("0")){
            return "0";
        }
        StringBuilder sb  =new StringBuilder();
        for(String value : values){
            sb.append(value);
        }

        return sb.toString();
    }

    // 5ms
}
