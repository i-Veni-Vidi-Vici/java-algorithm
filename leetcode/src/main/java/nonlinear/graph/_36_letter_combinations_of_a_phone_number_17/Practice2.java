package nonlinear.graph._36_letter_combinations_of_a_phone_number_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice2 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<Character, List<String>> map = new HashMap<>();

        map.put('2', List.of("a", "b", "c"));
        map.put('3', List.of("d", "e", "f"));
        map.put('4', List.of("g", "h", "i"));
        map.put('5', List.of("j", "k", "l"));
        map.put('6', List.of("m", "n", "o"));
        map.put('7', List.of("p", "q", "r", "s"));
        map.put('8', List.of("p", "u", "v"));
        map.put('9', List.of("w", "x", "y", "z"));

        dfs(result, map, "", digits.toCharArray(), 0);

        return result;
    }

    public void dfs(List<String> result, Map<Character, List<String>> map, String value, char[] digits, int index) {
        if (index >= digits.length) {
            result.add(value);
        }

        for (String s : map.get(digits[index])) {
            value += s;
            dfs(result, map, value, digits, ++index);

        }

    }
    // error
}
