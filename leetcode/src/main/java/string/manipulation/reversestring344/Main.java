package string.manipulation.reversestring344;

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

    // 0ms
}
