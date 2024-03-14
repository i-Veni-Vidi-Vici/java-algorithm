package nonlinear.graph.lettercombinationsofaphonenumber17;

import java.util.*;

public class Main2 {

    public void dfs(Map<String, List<String>> map, String[] digits, List<String> result, StringBuilder temp, int start) {
        if (digits.length == temp.length()) {
            result.add(temp.toString());
        }

        for (int i = start; i < digits.length; i++) {
            for (int j = 0; j < map.get(digits[i]).size(); j++) {
                temp.append(map.get(digits[i]).get(j));
                dfs(map, digits, result, temp, i + 1);
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        map.put("0", new ArrayList<>());
        map.put("1", new ArrayList<>());
        map.put("2", List.of("a", "b", "c"));
        map.put("3", List.of("d", "e", "f"));
        map.put("4", List.of("g", "h", "i"));
        map.put("5", List.of("j", "k", "l"));
        map.put("6", List.of("m", "n", "o"));
        map.put("7", List.of("p", "q", "r", "s"));
        map.put("8", List.of("t", "u", "v"));
        map.put("9", List.of("w", "x", "y", "z"));

        dfs(map, digits.split(""), result, new StringBuilder(), 0);

        return result;
    }
    // error
}
