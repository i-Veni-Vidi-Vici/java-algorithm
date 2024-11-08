package string.manipulation.roman_to_integer_13;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {
    public int romanToInt(String s) {
        String[] roman = s.split("");

        Map<String,Integer> values = new HashMap<>();
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);

        int result =0;
        for(int i=0; i<roman.length; i++){

            if(i<roman.length-1 && roman[i].equals("I")){
                if(roman[i+1].equals("V") || roman[i+1].equals("X")){
                    result += values.get(roman[i+1])-1;
                    i++;
                    continue;
                }

            } else  if(i<roman.length-1 && roman[i].equals("X")){
                if(roman[i+1].equals("L") || roman[i+1].equals("C")){
                    result += values.get(roman[i+1])-10;
                    i++;
                    continue;

                }
            }  else  if(i<roman.length-1 && roman[i].equals("C")){
                if(roman[i+1].equals("D") || roman[i+1].equals("M")){
                    result += values.get(roman[i+1])-100;
                    i++;
                    continue;

                }
            }

            result +=values.get(roman[i]);

        }

        return result;
    }

    // 12ms
}
