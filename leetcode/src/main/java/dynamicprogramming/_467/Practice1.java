package dynamicprogramming._467;

public class Practice1 {
    public int findSubstringInWraproundString(String s) {
        if(s.length()==1){
            return 1;
        }
        int count = 1;
        int result = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != 'z' && s.charAt(i - 1) + 1 == s.charAt(i)) {
                count++;
                result += count;
            } else if (s.charAt(i - 1) == 'z' && s.charAt(i) == 'a') {
                count++;
                result += count;
            } else {
                if (count == 1) {
                    result += count;
                }
                count = 1;
            }
        }
        if (count == 1) {
            result += count;
        }

        return result;
    }
    // error
}
