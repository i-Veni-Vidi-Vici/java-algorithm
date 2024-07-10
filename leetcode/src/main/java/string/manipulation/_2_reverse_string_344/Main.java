package string.manipulation._2_reverse_string_344;

public class Main {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    // 0ms, solution 1과 동일
}
