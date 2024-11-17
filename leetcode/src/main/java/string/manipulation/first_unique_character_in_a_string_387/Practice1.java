package string.manipulation.first_unique_character_in_a_string_387;

import java.util.LinkedHashMap;

public class Practice1 {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return  -1;
    }

    // 35ms
}
