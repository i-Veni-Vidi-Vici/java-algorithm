package sort.binarysearch._75_입국심사;

public class Practice2 {
    public long solution(int n, int[] times) {
        long answer =0;
        long left =0;
        long max =0;
        for(int i =0; i<times.length; i++){
            if(max<times[i]){
                max = times[i];
            }
        }
        long right = max *n;

        long mid = right;
        while(left<=right){
            long cnt=0;
            for(int i=0; i<times.length; i++){
                cnt+= mid/times[i];
            }

            if(cnt>=n){
                answer = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }

            mid = left + (right-left)/2;
        }

        return answer;
    }
//    테스트 1 〉	통과 (0.10ms, 77.2MB)
//    테스트 2 〉	통과 (0.11ms, 73.7MB)
//    테스트 3 〉	통과 (1.16ms, 84MB)
//    테스트 5 〉	통과 (47.64ms, 91.3MB)
//    테스트 6 〉	통과 (42.00ms, 78.9MB)
//    테스트 7 〉	통과 (58.77ms, 80.2MB)
//    테스트 8 〉	통과 (62.78ms, 82.4MB)
//    테스트 9 〉	통과 (0.10ms, 73.9MB)
}
