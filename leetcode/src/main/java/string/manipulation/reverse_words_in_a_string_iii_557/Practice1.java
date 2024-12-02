package string.manipulation.reverse_words_in_a_string_iii_557;

public class Practice1 {
    public String reverseWords(String s) {
        String[] val = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String str : val){
            int length = str.length()-1;
            if(!sb.toString().isEmpty()){
                sb.append(" ");
            }
            while(length>=0){
                sb.append(str.charAt(length--));
            }
        }

        return  sb.toString();
    }
    // 14ms
}
