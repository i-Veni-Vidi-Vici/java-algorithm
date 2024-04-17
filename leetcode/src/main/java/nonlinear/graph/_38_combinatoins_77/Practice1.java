package nonlinear.graph._38_combinatoins_77;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {

    public static void dfs(int n, int k, List<List<Integer>> result, List<Integer> value, int index) {
        if (value.size() == k) {
            result.add(new ArrayList<>(value));
            return;
        }

        for (int i = index;  i <= n; i++) {
            value.add(i);
            dfs(n, k, result, value, i+1);
            value.remove(value.size()-1);
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

    // 36 ms -> 18ms (remove이용) -> 21~22 (ArrayList -> LinkedList removeLast이용)
}
