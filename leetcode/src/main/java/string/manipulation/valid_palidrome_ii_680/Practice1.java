package string.manipulation.valid_palidrome_ii_680;

public class Practice1 {
    public boolean validPalindrome(String s) {
        int count =0;
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left++) != s.charAt(right--)){
                count++;
                if(count>1){
                    return false;
                }
            }
        }

        return true;
    }

    // error
}
