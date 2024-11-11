package string.manipulation.length_of_last_word_58;

public class Practice1 {
    public int lengthOfLastWord(String s) {
        String[] result =s.split(" ");
        return result[result.length-1].length();

        // 1ms
    }
}
