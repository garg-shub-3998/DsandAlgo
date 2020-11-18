import java.util.*;

public class coinchangepremu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i = 0; i < n; i++){
            coins[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int i = 0; i < n; i++){
            int coin = coins[i];
            // System.out.println(coin);
            for(int j = coin; j <= target; j++){
                dp[j] = dp[j] + dp[j-coin];
                // System.out.print(dp[j] + " ");
            }
            // System.out.println();
        }
        System.out.println(dp[target]);
    }
}