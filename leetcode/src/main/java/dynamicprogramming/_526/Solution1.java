package dynamicprogramming._526;

public class Solution1 {
    int count = 0;
    boolean[] visited;

    public int countArrangement(int n) {
        visited = new boolean[n + 1];
        backtrack(n, 1);
        return count;
    }

    private void backtrack(int n, int position) {
        if (position > n) {
            count++;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && (i % position == 0 || position % i == 0)) {
                visited[i] = true;
                backtrack(n, position + 1);
                visited[i] = false;
            }
        }
    }
    // 47ms
}
