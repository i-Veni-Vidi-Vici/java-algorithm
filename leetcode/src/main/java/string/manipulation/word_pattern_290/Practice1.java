package string.manipulation.word_pattern_290;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> result = new HashMap<>();
        Map<String, Character> result2 = new HashMap<>();

        String[] value = s.split(" ");
        for(int i=0; i<pattern.length(); i++){
            if(result.containsKey(pattern.charAt(i))){
                if(!result.get(pattern.charAt(i)).equals(value[i])){
                    return false;
                }
            }
            if(result.containsKey(pattern.charAt(i))){

                if(result2.get(value[i]) !=  pattern.charAt(i)){
                    return false;
                }
            }else{
                result.put(pattern.charAt(i), value[i]);
                result2.put( value[i], pattern.charAt(i));
            }

        }

        return true;
    }
    // error
}
