package nonlinear.graph.combinatoins77;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void dfs(int n, int k,int index, List<List<Integer>> result, List<Integer> temp) {
        if (k == temp.size()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i <= n; i++) {
            temp.add(i);
            dfs(n, k, i+1,result, temp);
            temp.remove(temp.size() - 1);
            }
        }


    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(n,k,1,result,new ArrayList<>());

        return result;
    }

    public static void main(String[] args) {
        combine(4, 2);
    }

    // 19ms
}
