package dynamicprogramming._120;

import java.util.*;
public class Practice2 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp =new int [triangle.get(triangle.size()-1).size()];
        for(int i=0; i<dp.length; i++){
            dp[i]= triangle.get(triangle.size()-1).get(i);
        }


        for(int i=triangle.size()-2; i>=0; i--){
            for(int j=0; j<triangle.get(i).size(); j++){
                dp[j]= triangle.get(i).get(j)+ Math.min(dp[j], dp[j+1]);
            }

        }

        return dp[0];
    }
    // 4ms
}
