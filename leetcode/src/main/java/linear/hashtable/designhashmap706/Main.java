package linear.hashtable.designhashmap706;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static class MyHashMap {
        int[] hash;
        public MyHashMap() {
            hash = new int[1000001];
            Arrays.fill(hash,-1);
        }


        public void put(int key, int value) {
            hash[key] = value;
        }

        public int get(int key) {
            return hash[key];
        }

        public void remove(int key) {
            hash[key] = -1;
        }
    }

    public static void main(String[] args) {
        MyHashMap a = new MyHashMap();
        a.put(1,1);
    }

    // 32ms

}
