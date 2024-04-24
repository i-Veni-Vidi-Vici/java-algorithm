package nonlinear.trie._62_implement_trie_208;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static class Trie {
        Map<Character, List<Character>> trie;

        public Trie() {
            trie = new HashMap<>();
        }

        public void insert(String word) {
            char[] charArray = word.toCharArray();
            for (int i = 0; i < charArray.length - 1; i++) {
                trie.putIfAbsent(charArray[i], new ArrayList<>());

                trie.get(charArray[i]).add(charArray[i + 1]);
            }


        }

        public boolean search(String word) {
            return false;
        }

        public boolean startsWith(String prefix) {
            return false;
        }
    }
    // error
}


