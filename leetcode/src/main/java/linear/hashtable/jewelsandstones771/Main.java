package linear.hashtable.jewelsandstones771;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();

        for (char stone : stones.toCharArray()) {
            map.put(stone, map.getOrDefault(stone, 0) + 1);
        }

        int sum =0;

        for (char jewel : jewels.toCharArray()) {
            sum += map.getOrDefault(jewel,0);
        }

        return sum;
    }
}

// 5~6ms -> 1~2ms String은 객체이므로 객체배열 만드는것보다, 원시형인 char로 배열을 만드는것이 더빠름
