package linear.array._31;

class Solution1 {
    public void nextPermutation(int[] nums) {
        // 1. 뒤에서부터 탐색하여 오름차순이 깨지는 첫 번째 위치(i)를 찾는다
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // 2. 만약 그런 위치가 있다면(i >= 0), 뒤에서부터 탐색하여
        // nums[i]보다 큰 첫 번째 숫자(j)를 찾아 swap한다
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        
        // 3. i+1부터 끝까지 뒤집는다 (오름차순으로 정렬)
        reverse(nums, i + 1, nums.length - 1);
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // 0ms
}