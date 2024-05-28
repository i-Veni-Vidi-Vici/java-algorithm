package dynamicprogramming._92_maximum_subarray_53;

// TODO : Best Solution
public class BestSolution {
    public int maxSubArray(int[] nums) {
        int c=0, m=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            c+=nums[i];
            m=c>m?c:m;
            if(c<0)
                c=0;
        }
        return m;
    }
    // 0ms
}
