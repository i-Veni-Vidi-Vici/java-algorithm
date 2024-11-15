package string.manipulation.isomorphic_strings_205;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> result = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(result.containsKey(s.charAt(i)) ){
                if(t.charAt(i) != result.get(s.charAt(i)) ){
                    return false;
                }

            } else if(result.containsKey(t.charAt(i))){
                if(result.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }

            else{
                result.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }
    // error
}
