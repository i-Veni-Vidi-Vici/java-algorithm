package linear.array.trappingrainwater42;

public class Main {
    public static int trap(int[] height) {
        int max = 1;
        int beforeMax = 0;
        boolean isTrue = false;
        int maxCount =0;
        int sum = 0;
        int sumCount = 1;
        int result =0;
        for (int i = 0; i < height.length; i++) {
            if (max <= height[i] && sumCount !=0) {
                if (isTrue) {
                    beforeMax = max;
                }
                max = height[i];
                maxCount++;

                isTrue = true;
            } else if(maxCount >0){
                sum += height[i];
                sumCount++;
            }

            if (maxCount == 2) {
                result += (Math.min(beforeMax, max)*sumCount)-sum ;
                sumCount =0;
                maxCount= 1;
                sum =0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
