package dynamicprogramming.maximum_repeating_substring_1668;

public class Practice1 {
    public int maxRepeating(String sequence, String word) {
        int length = word.length();
        int result =0;
        int max =0;
        for(int i=0; i<=sequence.length()-length; ){
            if(sequence.substring(i, length+i).equals(word)){
                result++;
                max = Math.max(result, max);
                i+= length;
            } else{
                if(result != 0){
                    i = i-length;
                    result =0;
                }
                i++;
            }
        }

        return max;
    }
    // 1ms
}
