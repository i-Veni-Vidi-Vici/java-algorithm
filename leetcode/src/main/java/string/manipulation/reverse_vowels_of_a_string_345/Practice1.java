package string.manipulation.reverse_vowels_of_a_string_345;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public String reverseVowels(String s) {
        int left =0;
        int right =s.length()- 1;
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('e', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('u', 1);

        char[] val = s.toCharArray();

        while(left<right){
            if(!map.containsKey(Character.toLowerCase(val[left]))){
                left++;
            }

            if(!map.containsKey(Character.toLowerCase(val[right]))){
                right--;
            }

            if(map.containsKey(Character.toLowerCase(val[left])) && map.containsKey(Character.toLowerCase(val[right]))){

                char tmp =val[left];
                val[left] = val[right];
                val[right]= tmp;
                left++;
                right--;
            }
        }

        return String.valueOf(val);
    }

    // 5ms
}
