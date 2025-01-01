package dynamicprogramming._97;

public class Practice1 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int index1 = 0;
        int index2 =0;
        for(int i=0; i<s3.length(); i++){
            if(index1<s1.length() && s1.charAt(index1)==s3.charAt(i)){
                index1++;
            }else if(index2<s2.length() && s2.charAt(index2)==s3.charAt(i)){
                index2++;
            } else{
                return false;
            }

        }

        return true;
    }
    // error
}
