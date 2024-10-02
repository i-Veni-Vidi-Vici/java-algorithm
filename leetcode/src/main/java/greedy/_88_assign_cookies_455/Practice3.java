package greedy._88_assign_cookies_455;

import java.util.Arrays;

public class Practice3 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int index =0;
        for(int i =0; index<g.length && i<s.length; i++){
            if(g[index]<= s[i]){
                index ++;
            }
        }

        return index;
    }
    // 12ms
}
