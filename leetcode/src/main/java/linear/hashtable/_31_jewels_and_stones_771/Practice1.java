package linear.hashtable._31_jewels_and_stones_771;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        int reuslt =0;
        for (char c : jewels.toCharArray()) {
            map.put(c, 1);
        }
        for (char c : stones.toCharArray()) {
            if (map.containsKey(c)) {
                reuslt++;
            }
        }

        return reuslt;
    }

    // 2ms
}
