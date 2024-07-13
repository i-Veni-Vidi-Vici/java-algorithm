package string.manipulation._5_groupanagrams_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1 {
    public  static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        for (String str : strs) {
            boolean checked = false;
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String string = new String(charArray);
            for (List<String> strings : result) {
                char[] charArray1 = strings.get(0).toCharArray();
                Arrays.sort(charArray1);
                if (new String(charArray1).equals(string)) {
                    strings.add(str);
                    checked = true;
                    break;
                }
            }
            if (!checked) {
                List<String> value = new ArrayList<>();
                value.add(str);
                result.add(value);

            }
        }

        return result;
    }

    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    // Time Limit Exceeded
}
