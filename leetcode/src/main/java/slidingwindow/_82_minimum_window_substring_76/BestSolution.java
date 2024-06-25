package slidingwindow._82_minimum_window_substring_76;


// TODO : int[] 자료형 사용
public class BestSolution {
    public  static String minWindow(String s, String t) {
        int tElements[] = new int[123]; //to track a-z & A-Z
        for(char c: t.toCharArray()){
            tElements[c]++; //count frequency of letters
        }

        char[]S = s.toCharArray();
        int minLength = Integer.MAX_VALUE, start = 0;
        int find = t.length();//Letters to be found

        int left = 0, right = 0;    //sliding window
        while(right < S.length){    //to slide right limit

            if(tElements[S[right]] > 0) find--;
            tElements[S[right]]--;
            right++;

            while(find == 0){   //to slide left limit when all required characters are found
                if(right-left < minLength){
                    start = left;
                    minLength = right-left;
                }
                if(tElements[S[left]] == 0) find++;
                tElements[S[left]]++;
                left++;
            }
        }
        if(minLength == Integer.MAX_VALUE) return new String();
        return s.substring(start, start+minLength);
    }

    public static void main(String[] args) {
        minWindow("ADOBECODEBANC", "ABC");
    }

    // 2ms
}
