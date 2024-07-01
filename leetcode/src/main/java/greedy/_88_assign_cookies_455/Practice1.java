package greedy._88_assign_cookies_455;

import java.util.Arrays;

public class Practice1 {
    public static int findContentChildren(int[] g, int[] s) {
        int result = 0;
        int index = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0; i < g.length; i++) {
            for (int j = index; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    index++;
                    result++;
                    break;
                } else {
                    index++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1,});
    }

    // 8ms
}
