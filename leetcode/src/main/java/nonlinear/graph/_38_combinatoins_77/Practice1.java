package nonlinear.graph._38_combinatoins_77;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {

    public static void dfs(int n, int k, List<List<Integer>> result, List<Integer> value, int index) {
        if (value.size() == k) {
            result.add(value);
            return;
        }

        for (int i = index;  i <= n; i++) {
            List<Integer> value2 = new ArrayList<>(value);
            value2.add(i);
            dfs(n, k, result, value2, i+1);
        }

    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(n,k, result,new ArrayList<>(), 1);
        return result;
    }

    public static void main(String[] args) {
        combine(4, 2);
    }

    // 36 ms
}
