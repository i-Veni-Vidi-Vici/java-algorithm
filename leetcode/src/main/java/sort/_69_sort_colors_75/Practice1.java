package sort._69_sort_colors_75;

public class Practice1 {
    public void sortColors(int[] nums) {
        int[] result = new int[3];
        for (int num : nums) {
            result[num]++;
        }

        int index =0;
        int value =0;
        for (int i : result) {
            for (int j = 0; j < i; j++) {
                nums[index++]= value;
            }
            value++;
        }

    }
    // 0ms
}
