package nonlinear.graph._36_letter_combinations_of_a_phone_number_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private void dfs(Map<String, List<String>> digit, int index, String[] digits, List<String> result, String str) {
        if (digits.length == str.length()) {
            result.add(str);
            return;
        }

        for (String s : digit.get(digits[index])) {
            dfs(digit, index + 1, digits, result, str + s);
        }
    }

    public List<String> letterCombinations(String digits) {
        Map<String, List<String>> digit = new HashMap<>();
        List<String> result = new ArrayList<>();

        if (digits.length() == 0)
            return result;

        digit.put("0", new ArrayList<>());
        digit.put("1", new ArrayList<>());
        digit.put("2", List.of("a", "b", "c"));
        digit.put("3", List.of("d", "e", "f"));
        digit.put("4", List.of("g", "h", "i"));
        digit.put("5", List.of("j", "k", "l"));
        digit.put("6", List.of("m", "n", "o"));
        digit.put("7", List.of("p", "q", "r", "s"));
        digit.put("8", List.of("t", "u", "v"));
        digit.put("9", List.of("w", "x", "y", "z"));

        dfs(digit, 0, digits.split(""), result, "");

        return result;
        // 1ms
    }
}
