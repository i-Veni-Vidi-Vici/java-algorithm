package string.manipulation.license_key_formatting_482;

public class Practice1 {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int val = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)== '-'){
                val = i;
                break;
            }
        }
        sb.append(s.substring(0, val));

        String a = s.substring(val+1);
        a = a.replaceAll("-", "");
        System.out.println(a);
        for(int i=0; i<a.length(); i++){
            if((i+1)%k==1){
                if(a.length() -i >=k){
                    sb.append("-");
                }else{
                    break;
                }

            }
            sb.append(a.charAt(i));

        }

        return sb.toString().toUpperCase();
    }
    // error
}
