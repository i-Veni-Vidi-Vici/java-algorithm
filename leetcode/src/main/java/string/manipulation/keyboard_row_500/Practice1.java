package string.manipulation.keyboard_row_500;

import java.util.*;

public class Practice1 {
    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('q', 1);
        map.put('w', 1);
        map.put('e', 1);
        map.put('r', 1);
        map.put('t', 1);
        map.put('y', 1);
        map.put('u', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('p', 1);

        map.put('a', 2);
        map.put('s', 2);
        map.put('d', 2);
        map.put('f', 2);
        map.put('g', 2);
        map.put('h', 2);
        map.put('j', 2);
        map.put('k', 2);
        map.put('l', 2);

        map.put('z', 3);
        map.put('x', 3);
        map.put('c', 3);
        map.put('v', 3);
        map.put('b', 3);
        map.put('n', 3);
        map.put('m', 3);


        List<String> result = new ArrayList<>();
        for(String word : words){
            boolean check = true;
            int val =0;
            for(char c : word.toLowerCase().toCharArray()){
                if(val != 0 && val != map.get(c)){
                    check = false;
                    break;
                }
                val = map.get(c);
            }
            if(check){
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
    // 1ms
}
