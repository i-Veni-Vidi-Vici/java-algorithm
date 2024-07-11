package string.manipulation._03_reorder_log_files_937;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Practice1 {
    public String[] reorderLogFiles(String[] logs) {
        List<String> result = new ArrayList<>();
        List<String> number = new ArrayList<>();
        for (String log : logs) {
            if (log.split(" ", 2)[1].matches(".*[a-zA-Z].*")) {
                result.add(log);
            } else number.add(log);

        }

        result.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] so1 = o1.split(" ", 2);
                String[] so2 = o2.split(" ", 2);
                int value = so1[1].compareTo(so2[1]);

                if (value == 0) {
                    return so1[0].compareTo(so2[0]);
                }
                return value;

            }
        });

        result.addAll(number);

        return result.toArray(new String[0]);
    }
    // 13ms
}
