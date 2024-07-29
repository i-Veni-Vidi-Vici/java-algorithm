package linear.stack._21_remove_duplicate_letters_316;

public class Practice1 {
    public String removeDuplicateLetters(String s) {
        char[] value = new char[26];
        for (char c : s.toCharArray()) {
            value[c - 97]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <value.length; i++) {
            if (value[i] > 0) {
                sb.append((char)('a'+i));
            }
        }

        return sb.toString();
    }

    // logic error
}
