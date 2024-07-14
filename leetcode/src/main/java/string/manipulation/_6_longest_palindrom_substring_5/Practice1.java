package string.manipulation._6_longest_palindrom_substring_5;

import java.util.Arrays;

public class Practice1 {
    public String longestPalindrome(String s) {
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j + i <= s.length(); j++) {
                char[] charArray = s.substring(j, i + j).toCharArray();
                boolean checked = true;
                for (int k = 0; k < charArray.length / 2; k++) {
                    if (charArray[k] != charArray[charArray.length - k - 1]) {
                        checked = false;
                        break;
                    }
                }

                if (checked) {
                    return new String(charArray);
                }

            }

        }

        return "";
    }
}
// Time Limit Exceeded
