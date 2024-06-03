package nonlinear.trie._62_implement_trie_208;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice1 {
    static class Trie {
        Map<Character, Set<Character>> trie;

        public Trie() {
            trie = new HashMap<>();
        }

        public void insert(String word) {
            char[] alphabets = word.toCharArray();

            for (int i = 0; i < alphabets.length; i++) {
                trie.putIfAbsent(alphabets[i], new HashSet<>());

                if (i == 0) {
                    trie.get(alphabets[i]).add('0');
                }
                if (i == alphabets.length - 1) {
                    trie.get(alphabets[i]).add('1');
                    return;
                }

                trie.get(alphabets[i]).add(alphabets[i + 1]);
            }


        }

        public boolean search(String word) {
            char[] alphabets = word.toCharArray();

            for (int i = 0; i < alphabets.length; i++) {
                if (i == 0) {
                    if (!trie.containsKey(alphabets[i]) || !trie.get(alphabets[i]).contains('0')) {
                        return false;
                    }
                }
                if (i == alphabets.length - 1) {
                    if (!trie.containsKey(alphabets[i]) || !trie.get(alphabets[i]).contains('1')) {
                        return false;
                    }

                    return true;
                }

                if (!trie.containsKey(alphabets[i]) || !trie.get(alphabets[i]).contains(alphabets[i + 1])) {
                    return false;
                }
            }

            return true;
        }

        public boolean startsWith(String prefix) {
            char[] alphabets = prefix.toCharArray();

            if (!trie.containsKey(alphabets[0]) || !trie.get(alphabets[0]).contains('0')) {
                return false;
            }

            if (alphabets.length == 1) {
                return trie.containsKey(alphabets[0]);
            }

            for (int i = 0; i < alphabets.length - 1; i++) {
                if (!trie.containsKey(alphabets[i]) || !trie.get(alphabets[i]).contains(alphabets[i + 1])) {
                    return false;
                }
            }

            return true;
        }
    }

}

// Wrong Answer