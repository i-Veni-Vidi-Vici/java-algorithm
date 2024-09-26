package slidingwindow._83_longest_repeating_character_replacement_424;

import java.util.Arrays;

public class Practice3 {
    public int characterReplacement(String s, int k) {
        int left =0;
        int right = 1;
        int max = Integer.MIN_VALUE;
        while(right<s.length()){
            int[] value = new int[26];
            for(int i=left; i< right; i++){
                value[s.charAt(i)-'A'] +=1;
            }
//            max= Math.max(max, Arrays.stream(value).sequential().max(Integer::compareTo));

            if(max+k<= right-left+1){
                left++;
            }

            right++;
        }

        return max+k;
        // error
    }
}
