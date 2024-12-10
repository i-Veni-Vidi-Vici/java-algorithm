package string.manipulation.long_pressed_name_925;

public class Practice1 {
    public boolean isLongPressedName(String name, String typed) {
        if(name.equals(typed)){
            return true;
        }
        if(name.length()>= typed.length()){
            return false;
        }
        int index =0;
        boolean checked = false;
        for(int i=0; i<typed.length(); i++){
            if(typed.charAt(i) != name.charAt(index)){
                if(i>=1 ){
                    if(typed.charAt(i)!=typed.charAt(i-1) || !checked){
                        return false;
                    }
                    if(typed.charAt(i)!=typed.charAt(i-1)){
                        checked =false;
                    }
                }else{
                    return false;
                }

            } else{
                checked = true;

                if(index< name.length()-1){
                    index++;
                }
            }
        }

        return name.charAt(name.length()-1) == typed.charAt(typed.length()-1);
    }
    // 1ms
}
