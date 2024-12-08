package string.manipulation.rotate_string_796;

public class Practice1 {
    public boolean rotateString(String s, String goal) {
        for(int i=0; i<s.length(); i++){
            if((s.substring(i, s.length())+s.substring(0,i)).equals(goal)){
                return true;
            }
        }

        return false;
    }
    // 1ms
}
