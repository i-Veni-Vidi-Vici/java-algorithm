package dynamicprogramming._94_house_robber_198;

public class Practice1 {
    public static int rob(int[] nums) {
        int result = 0;
        int index = 0;
        if (nums.length < 1) {
            return nums[0];
        }

        while (index < nums.length) {
            if (index < nums.length - 3) {
                if (nums[index] + Math.max(nums[index + 2], nums[index+3]) > nums[index + 1] + nums[index + 3]) {
                    result += nums[index];
                    index += 2;
                } else {
                    result += nums[index + 1];
                    index += 3;
                }
            } else {
                if (index + 2 < nums.length) {
                    result += Math.max(nums[index] + nums[index+2], nums[index + 1]);
                } else if (index == nums.length - 1) {
                    result += nums[index];
                } else {
                    result += Math.max(nums[index], nums[index + 1]);
                }
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        rob(new int[]{2,1,1,2});
    }
    // Wrong Answer
}
