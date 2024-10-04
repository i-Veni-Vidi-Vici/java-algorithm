package divideandconquer._90_different_ways_to_add_parentheses_241;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice2 {
    Map<String, List<Integer>> cache = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();

        if(cache.containsKey(expression)){
            return cache.get(expression);
        }

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '-' || expression.charAt(i) == '+'
                    || expression.charAt(i) == '*' || expression.charAt(i) == '/') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));

                for (int l : left) {
                    for (int r : right) {
                        if (expression.charAt(i) == '+') {
                            result.add(l + r);
                        }
                        if (expression.charAt(i) == '-') {
                            result.add(l - r);
                        }
                        if (expression.charAt(i) == '*') {
                            result.add(l * r);
                        }
                        if (expression.charAt(i) == '/') {
                            result.add(l / r);
                        }
                    }
                }
            }
        }

        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }

        cache.put(expression,result);
        return result;
    }
    // 3ms -> 2ms
}
