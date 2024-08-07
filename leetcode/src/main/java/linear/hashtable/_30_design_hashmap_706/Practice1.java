package linear.hashtable._30_design_hashmap_706;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    class MyHashMap {
        List<int[]> result;

        public MyHashMap() {
            result = new ArrayList<>();
        }

        public void put(int key, int value) {
            for (int[] ints : result) {
                if (ints[0] == key) {
                    ints[1] = value;
                    return;
                }
            }
            result.add(new int[]{key, value});
        }

        public int get(int key) {
            for (int[] ints : result) {
                if (ints[0] == key) {
                    return ints[1];
                }
            }
            return -1;
        }

        public void remove(int key) {
            for (int[] ints : result) {
                if (ints[0] == key) {
                    result.remove(ints);
                    return;
                }
            }
        }
    }

    // 597ms

}
