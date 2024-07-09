package string.manipulation._1_valid_palindrome_125;


public class Practice2 {
    public boolean isPalindrome(String s) {
        char[] value = s.toLowerCase().replaceAll("[^0-9a-z]", "").toCharArray();
        for (int i = 0; i < value.length/2; i++) {
            if (value[i] != value[value.length - i - 1]) {
                return false;
            }
        }

        return true;
    }

    // 14ms
}
