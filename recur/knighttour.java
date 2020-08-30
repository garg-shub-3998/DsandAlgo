import java.util.*;

public class knighttour{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];
        int sr = scn.nextInt();
        int sc = scn.nextInt();
        
        System.out.println(printTour(chess,sr,sc,1,""));
    }
    static int printTour(int[][] chess, int sr, int sc, int ele, String ans){
        if(ele == chess.length*chess.length + 1){
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        chess[sr][sc] = ele;
        if(sr-2 >= 0 && sc+1 < chess.length && chess[sr-2][sc+1] == 0){
            count += printTour(chess,sr-2,sc+1,ele+1,ans+sr+"-"+sc+", ");
        }
        if(sr-1 >= 0 && sc+2 < chess.length && chess[sr-1][sc+2] == 0){
            count += printTour(chess,sr-1,sc+2,ele+1,ans+sr+"-"+sc+", ");
        }
        if(sr+1 < chess.length && sc+2 < chess.length && chess[sr+1][sc+2] == 0){
            count += printTour(chess,sr+1,sc+2,ele+1,ans+sr+"-"+sc+", ");
        }
        if(sr+2 < chess.length && sc+1 < chess.length && chess[sr+2][sc+1] == 0){
            count += printTour(chess,sr+2,sc+1,ele+1,ans+sr+"-"+sc+", ");
        }
        if(sr+2 < chess.length && sc-1 >= 0 && chess[sr+2][sc-1] == 0){
            count += printTour(chess,sr+2,sc-1,ele+1,ans+sr+"-"+sc+", ");
        }
        if(sr+1 < chess.length && sc-2 >= 0 && chess[sr+1][sc-2] == 0){
            count += printTour(chess,sr+1,sc-2,ele+1,ans+sr+"-"+sc+", ");
        }
        if(sr-1 >= 0 && sc-2 >= 0 && chess[sr-1][sc-2] == 0){
            count += printTour(chess,sr-1,sc-2,ele+1,ans+sr+"-"+sc+", ");
        }
        if(sr-2 >= 0 && sc-1 >= 0 && chess[sr-2][sc-1] == 0){
            count += printTour(chess,sr-2,sc-1,ele+1,ans+sr+"-"+sc+", ");
        }
        chess[sr][sc] = 0;
        return count;
    }
}