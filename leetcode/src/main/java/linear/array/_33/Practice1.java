package linear.array._33;

public class Practice1 {
    public int search(int[] nums, int target) {
        if(nums.length==1 ){
            return nums[0]== target ? 0 : -1;
        }
        int index = 0;
        int mid = nums.length/2;

        while(true){
            if(mid+1<nums.length && nums[mid]> nums[mid+1]){
                index = mid +1;
                break;
            }
            if(mid>0  &&  nums[mid-1]> nums[mid] ){
                index = mid;
                break;
            }
            mid += (nums.length-mid)/2;
        }

        System.out.println(index);

        mid = (nums.length/2 + index)% nums.length;
        while(mid>=0 && mid < nums.length){
            if(nums[mid]== target){
                return mid;
            }
            if(nums[mid]>target){
                if(mid<index){
                    mid = (nums.length-index+ mid)/2 +index;
                }else{
                    mid =  (mid-index)/2+ index;
                }
            } else{
                if(mid<index){
                    mid = (index-1 -mid)/2+index;
                }else{
                    mid =  (nums.length-mid)/2 + index;
                }
            }
        }

        return -1;
    }
    // error
}
