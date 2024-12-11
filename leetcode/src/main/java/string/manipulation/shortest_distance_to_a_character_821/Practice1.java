package string.manipulation.shortest_distance_to_a_character_821;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public int[] shortestToChar(String s, char c) {
        List<Integer> value = new ArrayList<>();
        int index =0;
        for(char ch : s.toCharArray()){
            if(ch== c){
                value.add(index);
            }
            index++;
        }
        int[] result = new int[s.length()];

        index =0;
        int index2 =0;
        for(char ch : s.toCharArray()){
            if(ch != c){
                if(Math.abs(index -index2)> Math.abs(index -(index2+1))){
                }
            }
        }
        return result;
    }
    // error
}
