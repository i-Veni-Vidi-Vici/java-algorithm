package nonlinear.graph._38_combinatoins_77;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

            dfs(1, n,k, result, new ArrayList<>());

        return result;
    }

    public void dfs(int index, int n ,int k,List<List<Integer>> result, List<Integer> value ) {
        if (value.size() == k) {
            result.add(new ArrayList<>(value));
            return;
        }

        for (int i = index; i <=n; i++) {
            value.add(i);
            dfs(i+1, n,k, result, value);
            value.remove(value.size()-1);
        }

    }

    // 18ms
}
