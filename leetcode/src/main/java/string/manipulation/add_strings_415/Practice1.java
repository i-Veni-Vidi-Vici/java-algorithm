package string.manipulation.add_strings_415;

public class Practice1 {
    public String addStrings(String num1, String num2) {
        int carry =0;
        int sum=0;
        String[] str1 = num1.split("");
        String[] str2 = num2.split("");
        for(int i=0; i<Math.min(num1.length(), num2.length()); i++){
            int val = Integer.parseInt(str1[num1.length()-i-1]) +Integer.parseInt(str2[num2.length()-i-1]) ;
            carry = val/10;
            val %= 10;
            sum += (val+ carry)*Math.pow(10, i);
        }
        if(num1.length()> num2.length()){
            sum +=(Integer.parseInt(num1.substring(0, num2.length()))+ carry)*Math.pow(10,num2.length()-1 );
        } else if (num1.length()< num2.length()){
            sum +=(Integer.parseInt(num2.substring(0, num1.length()))+ carry)*Math.pow(10,num1.length() -1);
        }

        return String.valueOf(sum);
    }
    // error
}
