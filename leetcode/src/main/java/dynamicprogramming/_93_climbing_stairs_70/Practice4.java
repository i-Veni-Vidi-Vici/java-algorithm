package dynamicprogramming._93_climbing_stairs_70;

public class Practice4 {
    int[] memory =new int[45];
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }

        if(memory[n-1]!=0){
            return memory[n-1];
        }
        memory[n-1] = climbStairs(n-1)+ climbStairs(n-2);

        return memory[n-1];
    }
    // 0ms
}
