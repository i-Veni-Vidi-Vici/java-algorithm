package kakao_2022._96_신고결과받기;

import java.util.*;
public class Practice1 {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> value = new LinkedHashMap<>();
        for(String id : id_list){
            value.put(id, 0);
        }
        Set<String> realReport = new HashSet<>();

        for(String ids : report){
            realReport.add(ids);
        }


        for(String ids : realReport){
            String id =ids.split(" ")[1];
            value.put(id, value.get(id)+1);
        }

        int[] result =new int[id_list.length];

        for(int i=0; i<id_list.length; i++){
            result[i] =value.get(id_list[i]);
        }

        return result;
    }
    // error
}
