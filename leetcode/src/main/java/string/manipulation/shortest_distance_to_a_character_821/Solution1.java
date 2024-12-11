package string.manipulation.shortest_distance_to_a_character_821;

import java.util.*;
public class Solution1 {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans =new int[n];

        List<Integer> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c) li.add(i);
        }
        int start = 0;
        int end = li.size()-1;
        int left = -1;
        for(int i=0;i<n;i++){
            if( s.charAt(i)==c ){
                ans[i] = 0;
                left++;
            }
            else{
                if(i < li.get(start)) ans[i]=li.get(start) -i;
                else if(i > li.get(end)) ans[i]=i-li.get(end);
                else{
                    ans[i]= Math.min(i-li.get(left),li.get(left+1)-i);
                }
            }
        }
        return ans;
    }
    // 3ms
}
