package string.manipulation.repeated_substring_pattern_459;

public class Practice1 {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()%2 >0){
            return false;
        }
        if(s.substring(0, s.length()/2).equals(s.substring(s.length()/2))){
            return true;
        }
        return s.substring(0, s.length()/3).equals(s.substring(s.length()/3, s.length()/3*2 ))
                && s.substring(s.length()/3, s.length()/3*2 ).equals(s.substring(s.length()/3*2));
    }
    // error
}
