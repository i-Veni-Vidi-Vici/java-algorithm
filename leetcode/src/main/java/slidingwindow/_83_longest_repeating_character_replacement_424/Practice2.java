package slidingwindow._83_longest_repeating_character_replacement_424;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {
    public int characterReplacement(String s, int k) {
        int left =0;
        int right =s.length();
        while(left<right){
            Map<Character, Integer> result = new HashMap<>();
            char[] value =s.toCharArray();
            for(int i =left; i<right; i++){
                result.put(value[i], result.getOrDefault(value[i], 0)+1);
            }
            int length = right-left+1-2;

            for(int val : result.values()){
                if(val == length){
                    return val;
                }
            }
            left ++;
        }

        return 0;
    }

    // Wrong Answer
}
