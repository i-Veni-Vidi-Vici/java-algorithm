package dynamicprogramming._139;

import java.util.*;
public class Practice2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, wordDict, 0);
    }

    private boolean dfs(String s, List<String> wordDict, int end){
        if(s.length()==0){
            return true;
        }


        for(int i=0; i<wordDict.size(); i++){

            String word = wordDict.get(i);
            boolean check =true;
            if(s.length()>=word.length()){
                for(int j=0; j<word .length(); j++){
                    if(s.charAt(j)!= word.charAt(j)){
                        check =false;
                        break;
                    }
                }
            }else{
                check= false;
            }

            if(check){
                if(s.length()== word.length()){
                    return true;
                }

                boolean re = dfs(s.substring(word.length()), wordDict, word.length());
                if(re){
                    return true;
                }
            }


        }

        return false;
    }
    // Time Limit Exceeded
}
