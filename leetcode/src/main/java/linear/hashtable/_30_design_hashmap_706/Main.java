package linear.hashtable._30_design_hashmap_706;

public class Main {
    static class MyHashMap {
        int[] hash;
        public MyHashMap() {
            hash = new int[1000001];
//            Arrays.fill(hash,-1);
        }


        public void put(int key, int value) {
            if (value == 0) {
                hash[key] = -1;
                return;
            }
            hash[key] = value;

        }

        public int get(int key) {
            if (hash[key] == -1) {
                return 0;
            }
            if (hash[key] == 0) {
                return -1;
            }
            return hash[key];
        }

        public void remove(int key) {
            hash[key] = 0;
        }
    }

    public static void main(String[] args) {
        MyHashMap a = new MyHashMap();
        a.put(1,1);
    }

    // 32ms -> 17ms

}
