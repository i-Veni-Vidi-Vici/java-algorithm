package string.manipulation.longest_common_prefix_14;

public class Practice1 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length== 1){
            return strs[0];
        }
        String value = strs[0];
        for(int i=1; i<strs.length; i++){
            for(int j=0; j<value.length(); j++){
                if(strs[i].length()<=j || value.charAt(j) != strs[i].charAt(j)){
                    value = value.substring(0, j);
                    break;
                }
            }
        }

        return value;
    }
    // 2ms
}
