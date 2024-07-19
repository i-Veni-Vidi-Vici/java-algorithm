package linear.array._11_product_of_array_except_self_238

class Solution2 {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        // 왼쪽 곱셈
        var p = 1
        for (i in nums.indices) {
            result[i] = p
            // 왼쪽 곱셈 결과
            p *= nums[i]
        }
        // 오른쪽 곱셈, 왼쪽 곱셈 결과에 차례대로 곱하기
        p = 1
        for (i in nums.indices.reversed()) {
            // 왼쪽 곱셈 결과에 차례대로 곱한 최종 결과
            result[i] *= p
            // 오른쪽 곱셈 결과
            p *= nums[i]
        }
        return result
    }
}