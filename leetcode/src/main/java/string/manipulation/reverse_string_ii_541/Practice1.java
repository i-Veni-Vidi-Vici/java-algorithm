package string.manipulation.reverse_string_ii_541;

public class Practice1 {
    public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        if(s.length()== 1){
            return s;
        }
        String[] val = s.split("");
        for(int i=0; i<s.length(); ){

            if(i%(k*2)==0){
                int tmp= i;
                for(int j=0; j<k; j++){
                    if(i<s.length()){
                        sb.insert(tmp, val[i++]);
                    }
                }
            }else{
                sb.append(val[i++]);
            }

        }

        return sb.toString();
    }


    public static void main(String[] args) {
        reverseStr("abcdefg", 3);
    }
    // 34ms
}
