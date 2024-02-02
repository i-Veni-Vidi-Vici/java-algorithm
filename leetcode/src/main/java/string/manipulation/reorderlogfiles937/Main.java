package string.manipulation.reorderlogfiles937;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public String[] reorderLogFiles(String[] logs) {
        List<String> digits = new ArrayList<>();
        List<String> letters = new ArrayList<>();

        for (int i = 0; i < logs.length ; i++) {
            if (Character.isDigit(logs[i].split(" ", 2)[1].charAt(0))) {
                digits.add(logs[i]);
            } else {
                letters.add(logs[i]);
            }
        }

        letters.sort((s1,s2)->{
            String[] log1 = s1.split(" ", 2);
            String[] log2 = s2.split(" ", 2);
            int compared = log1[1].compareTo(log2[1]);

            if (compared == 0) {
                return log1[0].compareTo(log2[0]);
            }

            return compared;
        });

        letters.addAll(digits);
        return letters.toArray(new String[0]);
    }

    // 4ms
}
