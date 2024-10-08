package linear.array._11_product_of_array_except_self_238;

// TODO : 나눗셈 없이 O(n)
public class Solution1 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        // 왼쪽 곱셈
        int p = 1;
        for (int i = 0; i < nums.length; i ++) {
            result[i] = p;
            // 왼쪽 곱셈 결과
            p *= nums[i];
        }
        // 오른쪽 곱셈을 왼쪽 곱셈 결과에 차례대로 곱하기
        p = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            // 왼쪽 곱셈 결과에 차례대로 곱한 최종 결과
            result[i] *= p;
            // 오른쪽 곱셈 결과
            p *= nums[i];
        }
        return result;
    }

    // 1ms
}
