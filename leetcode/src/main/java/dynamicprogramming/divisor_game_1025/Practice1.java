package dynamicprogramming.divisor_game_1025;

public class Practice1 {
    public boolean divisorGame(int n) {
        boolean[] dp = new boolean[1001];

        dp[1] = false;
        dp[2] = true;
        dp[3] = false;
        dp[4] = true;
        if(n<=4){
            return dp[n];
        }
        int index = 5;


        while(index <= n){
            for(int i=1; i<index; i++){
                if(index%i ==0 && dp[index-i]== false ){
                    dp[index] = true;
                    break;
                }
            }
            index++;
        }

        return dp[n];
    }

    // 3ms
}
