package string.manipulation.find_the_index_of_the_first_occurrence_in_string_28;

public class Practice1 {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        for(int i=0; i<haystack.length()-needle.length()+1; i++){
            if(haystack.substring(i,needle.length()+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    // 0ms
}
