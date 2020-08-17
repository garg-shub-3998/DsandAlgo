import java.util.*;

public class minsp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Integer[] dp = new Integer[n+1];
        dp[n] = 0;
        for(int i = n-1; i >= 0; i--){
              if(arr[i] > 0){
                  int min = Integer.MAX_VALUE;
                  for(int j = 1; j <= arr[i] && i + j <= n; j++){
                      if(dp[i+j] != null){
                          min = Math.min(min,dp[i+j]);
                      }
                  }
                  if(min != Integer.MIN_VALUE){
                      dp[i] = min + 1;
                  }
              }
        }
        System.out.println(dp[0]);
    }
}