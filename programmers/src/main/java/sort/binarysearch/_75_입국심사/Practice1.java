package sort.binarysearch._75_입국심사;

import java.util.Arrays;

public class Practice1 {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        int count = 0;
        int sum =0;
        while (n>sum) {
            count++;
            sum=count;
            int value = times[0] * count;
            for (int i = 1; i < times.length; i++) {
                if (value >= times[i]) {
                    sum += value / times[i];
                } else break;
            }
        }

        return count*times[0];
    }
    // 테스트 1 〉	실패 (0.59ms, 73.9MB)
    //테스트 2 〉	실패 (0.89ms, 76.2MB)
    //테스트 3 〉	실패 (8.13ms, 70.1MB)
    //테스트 4 〉	실패 (229.75ms, 96MB)
    //테스트 5 〉	실패 (4277.03ms, 92.2MB)
    //테스트 6 〉	실패 (3928.63ms, 105MB)
    //테스트 7 〉	실패 (시간 초과)
    //테스트 8 〉	실패 (시간 초과)
    //테스트 9 〉	통과 (2891.92ms, 83.8MB)
}
