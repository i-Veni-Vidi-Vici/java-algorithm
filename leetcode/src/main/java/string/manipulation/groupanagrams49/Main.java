package string.manipulation.groupanagrams49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> values = new ArrayList<>(Arrays.asList(strs));


        for (int i = 0; i < values.size(); i++) {
            List<String> anagrams = new ArrayList<>();
            anagrams.add(values.get(i));
            char[] sortedA = values.get(i).toCharArray();
            Arrays.sort(sortedA);

            for (int j = i+1; j < values.size(); j++) {
                char[] sortedB = values.get(j).toCharArray();
                Arrays.sort(sortedB);
                if (new String(sortedA).equals(new String(sortedB))) {
                    anagrams.add(values.get(j));
                    values.remove(j--);
                }
            }

            result.add(anagrams);
        }

        return result;
    }

    // time out
}
