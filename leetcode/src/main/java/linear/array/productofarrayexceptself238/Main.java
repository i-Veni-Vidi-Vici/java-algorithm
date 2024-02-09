package linear.array.productofarrayexceptself238;

public class Main {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    result[i] *= nums[j];
                }
            }
        }

        return result;
    }

    // Time Limit Exceeded
}
