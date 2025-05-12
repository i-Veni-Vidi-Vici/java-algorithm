package dynamicprogramming._526;

public class Practice1 {
    public int countArrangement(int n) {
        boolean[] visited = new boolean[n + 1]; // 1-based 인덱스
        return backtrack(n, 1, visited);
    }

    private int backtrack(int n, int pos, boolean[] visited) {
        if (pos > n) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && (i % pos == 0 || pos % i == 0)) {
                visited[i] = true;
                count += backtrack(n, pos + 1, visited);
                visited[i] = false;
            }
        }

        return count;
    }
    // 43ms
}
