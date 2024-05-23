package greedy._88_assign_cookies_455;

import java.util.Arrays;

public class Main {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count =0;
        int index =0;
        for (int i = 0; i < g.length; i++) {
            for (int j = index; j <s.length ; j++) {
                if (g[i] <= s[j]) {
                    count++;
                    index ++;
                    break;
                } else if (g[i] > s[j]) {
                    index ++;
                }
            }
            if (index == s.length) {
                break;
            }
        }

        return count;
    }
    // 8~9ms
}
