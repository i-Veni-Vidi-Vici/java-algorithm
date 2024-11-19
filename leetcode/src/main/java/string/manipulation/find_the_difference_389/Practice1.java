package string.manipulation.find_the_difference_389;

public class Practice1 {
    public char findTheDifference(String s, String t) {
        int[] val = new int[26];
        for(Character c : s.toCharArray()){
            val[c-'a'] +=1;
        }
        for(Character c : t.toCharArray()){
            val[c-'a'] -=1;
        }
        for(Character c : t.toCharArray()){
            if(val[c-'a']== -1){
                return c;
            }
        }

        return 'a';
    }
    // 3ms
}
