package string.manipulation._2255;

public class Practice1 {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(String word : words) {
            // s가 word로 시작하는지 확인
            if(s.startsWith(word)) {
                count++;
            }
        }
        return count;
    }
    // 1ms
}
