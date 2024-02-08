package linear.array.arraypartition561;

public class Solution4 {
    public int arrayPairSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        short[] count = new short[max - min + 1];
        for (int num : nums) {
            count[num - min]++;  // 인덱스로 정렬됨
        }
        int result = 0;
        int rem = 1; // 홀수번째만 순서대로 더하기 위해 사용
        for(int i=0; i < count.length; i++) {
            short c = count[i];
            if (c != 0) {
                int cr = c + rem;
                rem = cr & 1;
                result += (i + min) * (cr >>> 1);
            }
        }
        return result;
    }

    // 3ms
}
