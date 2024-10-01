package greedy._88_assign_cookies_455;

import java.util.Arrays;

public class Practice2 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result=0;

        int index =0;
        for(int i=0; i<s.length && index<g.length; i++){
            if(s[i]>= g[index]){
                result ++;
                index++;
            }
        }

        return result;
    }

    // 9ms
}
