package linear.array._08_trapping_rain_water_42;

public class Practice1 {
    public int trap(int[] height) {
        int leftIndex  = 0;
        int leftMax = height[leftIndex];
        int rightIndex = height.length - 1;
        int rightMax = height[rightIndex];
        int result = 0;
        while (leftIndex < rightIndex) {
            if (height[leftIndex] < height[rightIndex]) {
                leftIndex++;
                if (leftMax > height[leftIndex]) {
                    result += leftMax - height[leftIndex];
                } else if (leftMax < height[leftIndex]) {
                    leftMax = height[leftIndex];
                }
            } else {
                rightIndex--;
                if (rightMax > height[rightIndex]) {
                    result += rightMax - height[rightIndex];
                } else if (rightMax < height[rightIndex]) {
                    rightMax = height[rightIndex];
                }
            }
        }
        return result;
    }

    // 0ms
}
