package nonlinear.trie._63_palindrome_pairs_336;

import java.util.*;

public class Practice2 {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(i==j){
                    continue;
                }
                String value = words[i]+words[j];
                char[] word = value.toCharArray();
                boolean checked = true;
                for(int k =0; k<word.length/2; k++){
                    if(word[k]!= word[word.length-1-k]){
                        checked = false;
                        break;
                    }
                }
                if(checked){
                    result.add(Arrays.asList(i, j));
                }

            }
        }

        return result;
    }
    // Time Limit Exceeded
}
