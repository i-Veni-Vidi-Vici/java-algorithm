package linear.array._08_trapping_rain_water_42;

public class Main {
    public static int trap(int[] height) {
        int max = 1;
        int beforeMax = 0;
        boolean isTrue = false;
        int maxCount =0;
        int sum = 0;
        int sumCount = 0;
        int result =0;
        boolean isSum = true;
        for (int i = 0; i < height.length; i++) {
            if (max <= height[i] && isSum) {
                if (isTrue && beforeMax < max) {
                    beforeMax = max;
                }
                max = height[i];
                maxCount++;

                isSum = false;
                isTrue = true;
            } else if(maxCount >0){
                isSum = true;
                sum += height[i];
                sumCount++;
            }

            if (maxCount == 2) {
                result += (Math.min(beforeMax, max)*sumCount)-sum ;
                beforeMax = max;
                max =0;
                sumCount =0;
                maxCount= 1;
                sum =0;
            }
        }

        return result;
    }

    // fail

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
