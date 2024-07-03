package divideandconquer._90_different_ways_to_add_parentheses_241;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        char[] charArray = expression.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == '+' || charArray[i] == '-' || charArray[i] == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));

                for (Integer leftNum : left) {
                    for (Integer rightNum : right) {
                        if (charArray[i] == '+') {
                            result.add(leftNum + rightNum);
                        } else if (charArray[i] == '-') {
                            result.add(leftNum - rightNum);
                        } else if (charArray[i] == '*') {
                            result.add(leftNum * rightNum);
                        }
                    }
                }
            }
        }


        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
            return result;
        }
        return result;
    }

    // 1ms
}
