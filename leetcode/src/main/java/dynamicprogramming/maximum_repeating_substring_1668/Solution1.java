package dynamicprogramming.maximum_repeating_substring_1668;

public class Solution1 {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        StringBuilder sb = new StringBuilder();

        while (true) {
            sb.append(word);  // word를 한 번 더 추가
            // 만들어진 문자열이 sequence보다 길어지면 중단
            if (sb.length() > sequence.length()) {
                break;
            }
            // sequence에 포함되어 있는지 확인
            if (sequence.contains(sb.toString())) {
                k++;  // 포함되어 있다면 k 증가
            } else {
                break;  // 포함되어 있지 않다면 중단
            }
        }

        return k;
    }
    // 0ms
}
