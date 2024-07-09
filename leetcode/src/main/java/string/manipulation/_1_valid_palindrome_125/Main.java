package string.manipulation._1_valid_palindrome_125;

public class Main {
    public static boolean isPalindrome(String s) {
        String lowerCase = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = lowerCase.length();

        for (int index = 0; index < length/2 ; index++) {
            if (lowerCase.charAt(index) != lowerCase.charAt(length - index-1)) {
                return false;
            }
        }

        return true;
    }

    // 13~14ms
}
