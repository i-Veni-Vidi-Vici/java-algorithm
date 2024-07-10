package string.manipulation._2_reverse_string_344;

public class Practice1 {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }

    // 0ms
}
