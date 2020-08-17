import java.util.*;

public class minmaze{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int[][] dp = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = r-1; i >= 0; i--){
            for(int j = c-1; j >= 0; j--){
                if(i == r-1 && j == c-1){
                    dp[i][j] = arr[i][j];
                }else if(i == r-1){
                    dp[i][j] = arr[i][j] + dp[i][j+1];
                }else if(j == c-1){
                    dp[i][j] = arr[i][j] + dp[i+1][j];
                }else{
                    dp[i][j] = arr[i][j] + Math.min(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        System.out.println(dp[0][0]);
    }
    
}