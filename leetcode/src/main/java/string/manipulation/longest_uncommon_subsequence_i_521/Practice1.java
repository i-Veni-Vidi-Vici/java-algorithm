package string.manipulation.longest_uncommon_subsequence_i_521;

public class Practice1 {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }

        return Math.max(a.length(), b.length());
    }
    // 0ms
}
