package sort._68_valid_anagram_242;

public class Practice5 {
    public boolean isAnagram(String s, String t) {
        int[] values = new int[26];
        for(char c : s.toCharArray()){
            values[c-'a']++;
        }

        for(char c : t.toCharArray()){
            values[c-'a']--;
        }

        for(int value : values){
            if(value!= 0){
                return false;
            }
        }

        return true;
    }
    // 2ms
}
