import java.util.*;

public class goldmine{
    public static void main(String[] args){
        int[][] mine = {
            {1, 0, 3, 6, 2, 8},
            {7, 1, 0, 0, 1, 5},
            {1, 1, 1, 1, 1, 1},
            {5, 5, 5, 3, 7, 2},
            {2, 0, 1, 0, 1, 6},
            {6, 3, 2, 1, 4, 2}
        };
        int[][] ans = new int[6][6];
        System.out.println(printMax(mine,ans));
        
    }
    static int printMax(int[][] mine, int[][] ans){
        int r = mine.length;
        int c = mine[0].length;
        for(int col = c-1; col >= 0; col--){
        for(int row = 0; row < r; row++){
             ans[row][col] += mine[row][col];
             int max = 0;
             if(col+1 < c){
                 max = Math.max(max,ans[row][col+1]);
             }
             if(col+1 < c && row-1 >= 0){
                 max = Math.max(max,ans[row-1][col+1]);
             }
             if(col+1 < c && row+1 < r){
                 max = Math.max(max,ans[row+1][col+1]);
             }
             ans[row][col] += max;
        }
        }

        int maxGold = Integer.MIN_VALUE;
        for(int i = 0; i < r; i++){
            maxGold = Math.max(maxGold,ans[i][0]);
        }
        return maxGold;
    }
}