package string.manipulation.longest_palindrome_409;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int result = 0;
        int val= 0;
        for(char c : map.keySet()){
            if(map.get(c)%2== 0){
                result += map.get(c);
            }else{
                val = Math.max(val, map.get(c));
            }
        }

        return result +val;
    }
    // error
}
