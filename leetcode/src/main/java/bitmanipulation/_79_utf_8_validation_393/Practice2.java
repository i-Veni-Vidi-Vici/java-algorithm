package bitmanipulation._79_utf_8_validation_393;

public class Practice2 {
    public boolean validUtf8(int[] data) {
        int count =0;
        for(int i=0; i<data.length; i++){
            char[] value =String.format("%8s", Integer.toBinaryString(data[i])).replace(' ', '0').toCharArray();
            if(value[0]== '1'){
                if(value[1] =='0'){
                    if(count >0){
                        count --;
                    } else{
                        return false;
                    }
                }else{
                    if(count !=0){
                        return false;
                    }
                    if(value[1] == '1'&& value[2]=='0'){
                        count =1;
                    }
                    else if(value[1] == '1'&& value[2] == '1' && value[3]=='0'){
                        count =2;
                    }
                    else  if(value[1] == '1'&& value[2] == '1' && value[3]=='1'&& value[4]=='0'){
                        count =3;
                    }
                    else{ return false;}
                }
            }
        }

        return count == 0;
    }

   // 48ms
}
