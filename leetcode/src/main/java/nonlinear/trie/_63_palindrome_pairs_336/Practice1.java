package nonlinear.trie._63_palindrome_pairs_336;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    class TrieNode {
        TrieNode[] nodes;
        boolean word;
        int index;
        public TrieNode() {
            this.nodes = new TrieNode[26];
            word = false;
            index =-1;
        }
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        TrieNode root = new TrieNode();
        List<List<Integer>> result = new ArrayList<>();


        // insert
        for (int i = 0; i < words.length; i++) {
            TrieNode node = root;

            for (char alphabet : words[i].toCharArray()) {
                if (node.nodes[alphabet - 'a'] == null) {
                    node.nodes[alphabet-'a']= new TrieNode();
                }

                node = node.nodes[alphabet-'a'];
            }
            node.index = i;
            node.word= true;
        }

        for (int i = 0; i < words.length; i++) {

            TrieNode node = root;
            char[] charArray =words[i].toCharArray();
            for (int j = charArray.length-1; j >=0; j--) {
                if (node.nodes[charArray[j] - 'a'] == null) {
                    break;
                }
                node = node.nodes[charArray[j]-'a'];
                if (j== 0 && node.word) {
                    if (node.index != i) {
                        result.add(List.of(node.index, i));

                    }
                }
            }


        }

        return  result;
    }
    // fail
}
