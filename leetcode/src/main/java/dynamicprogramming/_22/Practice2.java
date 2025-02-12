package dynamicprogramming._22;

import java.util.*;

public class Practice2 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(n, 0, 0, result, "");
        return result;
    }

    private void dfs(int n, int open, int close, List<String> result, String current){
        if(open<close){
            return;
        }
        if(n*2 == open + close){
            result.add(current);
            return;
        }

        if(open<n){
            dfs(n, open+1, close, result, current+"(");
        }

        if(close<n){
            dfs(n, open, close+1, result, current+")");
        }
    }
    // 2ms
}
