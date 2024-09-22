package bitmanipulation._79_utf_8_validation_393;

public class Practice3 {
    public boolean validUtf8(int[] data) {
        int count =0;
        for(int i=0; i<data.length; i++){
            if((data[i] & 0b10000000) == 0){
                if(count !=0){
                    return false;
                }
            }
            else if((data[i] & 0b11000000) == 0b10000000){
                if(count >0){
                    count--;
                } else return false;
            }
            else if((data[i] & 0b11100000) == 0b11000000 ){
                if(count == 0){
                    count = 1;
                } else return false;
            } else if((data[i] & 0b11110000) == 0b11100000 ){
                if(count == 0){
                    count = 2;
                } else return false;
            } else if((data[i] & 0b11111000) == 0b11110000 ){
                if(count == 0){
                    count = 3;
                } else return false;
            } else return false;
        }

        return count ==0;
    }
    // 2ms
}
