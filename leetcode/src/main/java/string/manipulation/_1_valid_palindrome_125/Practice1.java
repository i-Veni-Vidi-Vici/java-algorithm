package string.manipulation._1_valid_palindrome_125;

public class Practice1 {
    public static boolean isPalindrome(String s) {

        String value = s.toLowerCase().replaceAll("[^0-9a-z]","");
        StringBuilder sb = new StringBuilder(value);
        sb.reverse();

        return value.equals(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println( isPalindrome("A man, a plan, a canal: Panama"));
    }
}

// 13ms
