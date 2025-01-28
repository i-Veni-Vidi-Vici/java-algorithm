package dynamicprogramming._486;

public class Practice1 {
    public boolean predictTheWinner(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int p1 =0;
        int p2 =0;
        while(left<right){
            int leftV = nums[left];
            int rightV = nums[right];
            if(leftV- Math.max(nums[left+1],rightV) > rightV- Math.max(nums[right-1],leftV)){
                p1+=leftV;
                if(nums[left+1]>rightV){
                    p2+=nums[left+1];
                    left++;
                }else{
                    p2+=rightV;
                    right--;
                }
                left++;
            }else{
                p1+=rightV;
                if(nums[right-1]>leftV){
                    p2+=nums[right-1];
                    right--;
                }else{
                    p2+=leftV;
                    left++;
                }
                right--;
            }
        }
        if(left== right){
            p1+=nums[left];
        }

        return p1>=p2;
    }
    // error
}
