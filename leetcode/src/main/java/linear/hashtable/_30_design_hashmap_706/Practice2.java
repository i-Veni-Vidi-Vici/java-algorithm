package linear.hashtable._30_design_hashmap_706;

public class Practice2 {
    class MyHashMap {
        int[] result;
        public MyHashMap() {
            result = new int[1000001];
            for (int i = 0; i < result.length; i++) {
                result[i] = -1;
            }
        }

        public void put(int key, int value) {
            result[key] = value;
        }

        public int get(int key) {
            if (result[key] != -1) {
                return result[key];
            }

            return -1;
        }

        public void remove(int key) {
            result[key] = -1;
        }
    }

    // 32ms

}
