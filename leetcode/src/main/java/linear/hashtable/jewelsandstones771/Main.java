package linear.hashtable.jewelsandstones771;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public int numJewelsInStones(String jewels, String stones) {
        Map<String, Integer> map = new HashMap<>();

        for (String stone : stones.split("")) {
            map.put(stone, map.getOrDefault(stone, 0) + 1);
        }

        int sum =0;
        for (String jewel : jewels.split("")) {
            sum += map.getOrDefault(jewel,0);
        }

        return sum;
    }
}

// 5~6ms
