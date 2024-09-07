package nonlinear.trie._62_implement_trie_208;

import java.util.*;

public class Practice2 {
    class Trie {
        private final Map<Character, List<List<Character>>> map;

        public Trie() {
            map = new HashMap<>();
        }

        public void insert(String word) {
            char[] values = word.toCharArray();
            for (int i = 0; i < values.length; i++) {
                if (i == 0) {
                    if (!map.containsKey(values[i])) {
                        map.put(values[i], new ArrayList<>());
                    }
                } else {
                    map.get(values[0]).add(new ArrayList<>());
                }


            }
        }

        public boolean search(String word) {
            return false;
        }

        public boolean startsWith(String prefix) {
            return false;
        }
    }
}
