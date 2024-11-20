package string.manipulation.is_subsequence_392;

public class Practice1 {
    public boolean isSubsequence(String s, String t) {
        int index =0;
        for(int i=0; i<t.length(); i++){
            if(index==s.length()) return true;
            if(s.charAt(index)== t.charAt(i)){
                index++;
            }
        }

        return index==s.length();
        // 3m 22s
        // 2ms
    }
}

