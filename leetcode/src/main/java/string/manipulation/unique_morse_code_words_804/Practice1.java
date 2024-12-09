package string.manipulation.unique_morse_code_words_804;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] str = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        Set<String> set = new HashSet<>();
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()){
                sb.append(str[c-97]);
            }
            set.add(sb.toString());
        }

        return set.size();
    }
    // 2ms
}
