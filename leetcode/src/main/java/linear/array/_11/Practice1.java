package linear.array._11;

public class Practice1 {
    public int maxArea(int[] height) {
        // 투포인터
        int left= 0;
        int right = height.length-1;
        int max =0;
        while(left<right){
            if(height[left]<height[right]){
                max= Math.max(max,(right-left)*height[left]);
                left++;
            }else{
                max= Math.max(max,(right-left)*height[right]);
                right--;
            }
        }

        return max;
    }
    // 3ms
}
