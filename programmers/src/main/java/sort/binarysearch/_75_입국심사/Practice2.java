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
            int cnt=0;
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
//    테스트 1 〉	통과 (0.07ms, 74.3MB)
//    테스트 2 〉	통과 (0.11ms, 74.9MB)
//    테스트 3 〉	통과 (1.21ms, 80.7MB)
//    테스트 4 〉	실패 (3.19ms, 81.1MB)
//    테스트 5 〉	실패 (3.08ms, 86.8MB)
//    테스트 6 〉	실패 (39.83ms, 88.6MB)
//    테스트 7 〉	실패 (3.89ms, 79.9MB)
//    테스트 8 〉	실패 (3.62ms, 84.5MB)
//    테스트 9 〉	실패 (0.06ms, 73.8MB)
}
