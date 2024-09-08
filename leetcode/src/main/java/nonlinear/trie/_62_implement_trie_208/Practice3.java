package nonlinear.trie._62_implement_trie_208;

public class Practice3 {
//    class Trie {
//        boolean word = false;
//        Trie[] children;
//        public Trie() {
//            children = new Trie[26];
//
//        }
//
//        public void insert(String word) {
//            char[] values = word.toCharArray();
//            for(char value : values){
//                if(children[value-'a'] == null){
//                    children[value-'a'] = new Trie();
//                }
//
//                this = children[value-'a'];
//            }
//            word = true;
//
//        }
//
//        public boolean search(String word) {
//            char[] values = word.toCharArray();
//            for(char value : values){
//                if(children[value-'a'] == null){
//                    return false;
//                }
//
//                this = children[value-'a'];
//            }
//            return word==true;
//        }
//
//        public boolean startsWith(String prefix) {
//            char[] values = prefix.toCharArray();
//            for(char value : values){
//                if(children[value-'a'] == null){
//                    return false;
//                }
//
//                this = children[value-'a'];
//            }
//            return true;
//        }
//    }
// error
}
