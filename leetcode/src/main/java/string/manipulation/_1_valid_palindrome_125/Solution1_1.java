package string.manipulation._1_valid_palindrome_125;

public class Solution1_1 {
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char front = s.charAt(start);
            while (!Character.isLetterOrDigit(front) && start < end) {
                front = s.charAt(++start);
            }

            char back = s.charAt(end);
            while (!Character.isLetterOrDigit(back) && start < end) {
                back = s.charAt(--end);
            }

            if (Character.toLowerCase(front) != Character.toLowerCase(back)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
    // 2~3ms
}
