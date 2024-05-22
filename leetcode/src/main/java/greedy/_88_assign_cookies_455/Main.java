package greedy._88_assign_cookies_455;

import java.util.Arrays;

public class Main {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        int count =0;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j <s.length; j++) {
                if (s[j] == 0) {
                    continue;
                }
                if (g[i] > s[j]) {
                    g[i] -= s[j];
                    s[j] = 0;
                } else if (g[i] <= s[j]) {
                    s[j] -= g[i];
                    g[i] = 0;
                    count++;
                    break;
                }
            }

        }

        if (count > s.length) {
            return s.length;
        }
        return count;
    }
    // modifying - error 쿠키 한번사용하면 끝
}
