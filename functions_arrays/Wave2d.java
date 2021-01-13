import java.util.*;

public class Wave2d{
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            arr[i][j] = scn.nextInt();
        }
    }

    

    int minrow = 0;
    int maxrow = n-1;

    for(int j = 0; j < m;j++){
        for(int i = minrow; i <= maxrow; i++){
            System.out.print(arr[i][j] + "\t");
        }
        j++;
        for(int i = maxrow; i >= minrow; i--){
            System.out.print(arr[i][j] + "\t");
        }
    }
    }
}