package string.manipulation._6_longest_palindrom_substring_5;

import java.util.Arrays;

public class Main {
    public String longestPalindrome(String s) {
        String[] values = s.split("");
        String result = "";
        String tmpResult = "";
        int length = 0;
        int tmpLength = 0;

        boolean isPalindrome = false;

        for (int i = 0; i < values.length; i++) {
            for (int j = i; j < values.length; j++) {
                if (values[i].equals(values[j]) && length < (j - i + 1)) {
                    tmpLength = length;
                    length = j - i + 1;
                    isPalindrome = true;
                    tmpResult = result;
                    result = String.join("", Arrays.copyOfRange(values, i, j + 1));

                    for (int k = 0; k < (j - i) / 2; k++) {
                        if (!values[i + k + 1].equals(values[j - k - 1])) {
                            isPalindrome = false;
                            length = tmpLength;
                            result = tmpResult;
                            break;
                        }
                    }

                }
            }
        }

        return result;
    }

    // time out
}
