package string.manipulation.isomorphic_strings_205;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(sToT.containsKey(charS)){
                if(charT != sToT.get(charS)) return false;
            } else if(tToS.containsKey(charT)){
                if(charS != tToS.get(charT)) return false;
            } else {
                sToT.put(charS, charT);
                tToS.put(charT, charS);
            }
        }
        return true;
    }
    // 11ms
}
