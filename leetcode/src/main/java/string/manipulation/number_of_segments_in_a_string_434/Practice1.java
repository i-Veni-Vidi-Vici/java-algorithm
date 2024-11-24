package string.manipulation.number_of_segments_in_a_string_434;

public class Practice1 {
    public int countSegments(String s) {
        if(s.equals("")){
            return 0;
        }
        String[] str = s.split(" ");
        int result =0;
        for(int i=0; i<str.length; i++){
            if(!str.equals("")){
                result ++;
            }
        }
        return result;
    }
    // 0ms
}
