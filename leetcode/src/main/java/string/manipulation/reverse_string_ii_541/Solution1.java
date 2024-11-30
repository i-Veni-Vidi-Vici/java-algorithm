package string.manipulation.reverse_string_ii_541;

public class Solution1 {
    public String reverseStr(String s, int k) {
        // Convert string to char array for easy manipulation
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int start = 0; start < n; start += 2 * k) {
            // Calculate the end index for reversing
            int end = Math.min(start + k - 1, n - 1);

            // Reverse the characters from start to end
            reverse(chars, start, end);
        }

        // Convert char array back to string
        return new String(chars);
    }

    // Helper method to reverse characters in a range
    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
