package dynamicprogramming._139;

import java.util.List;

public class Practice1 {
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, wordDict);

    }
    public boolean dfs(String s, List<String> wordDict){
        if(s.isEmpty()){
            return true;
        }

        for(String word : wordDict){
            if( s.length()>=word.length() && s.substring(0, word.length()).equals(word)){
                boolean a =dfs(s.substring(word.length(), s.length()), wordDict);
                if(a){
                    return true;
                }
            }
        }

        return false;
    }

    // Time Limit Exceeded
}
