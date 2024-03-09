package nonlinear.graph.combinatoins77;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void dfs(int n, int k,int index, List<List<Integer>> result, List<Integer> temp) {
        if (k == temp.size()) {
            result.add(new ArrayList<>(temp));
            temp = new ArrayList<>();
            return;
        }

        for (int i = 0; i < n; i++) {
            temp.add(i+index);
            dfs(n, k, index+1,result, temp);
            }
        }


    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(n,k,0,result,new ArrayList<>());

        return result;
    }

    public static void main(String[] args) {
        combine(4, 2);
    }

    // error
}
