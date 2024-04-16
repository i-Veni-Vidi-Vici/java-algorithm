package nonlinear.graph._36_letter_combinations_of_a_phone_number_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice1 {
    public void dfs(char[] values , List<String> result, int index, Map<Character, List<String>> data, StringBuilder sb) {

        for (int i = index; i < values.length; i++) {
            for (String string : data.get(values[i])) {
                sb.append(string);
                dfs(values, result, index++, data, sb);
            }

        }
    }

    public List<String> letterCombinations(String digits) {
        Map<Character, List<String>> data = new HashMap<>();
        data.put('1', new ArrayList<>());
        data.put('2', List.of("a","b","c"));
        data.put('3', List.of("d","e","f"));
        data.put('4', List.of("g","h","i"));
        data.put('5', List.of("j","k", "l"));
        data.put('6', List.of("m","n","o"));
        data.put('7', List.of("p","q","r","s"));
        data.put('8', List.of("t","u","v"));
        data.put('9', List.of("w","x","y","z"));
        List<String> result = new ArrayList<>();
        char[] values = digits.toCharArray();
        dfs(values, result, 0, data, new StringBuilder());

        return result;
    }
    // error
}
