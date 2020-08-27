import java.util.*;

public class floodfill{
    public static void main(String[] args){
        int[][] board = {
            {0 , 1 , 0 , 0 , 0 , 0 , 0},
            {0 , 0 , 0 , 1 , 0 , 0 , 0},
            {1 , 0 , 0 , 0 , 0 , 0 , 0},
            {1 , 1 , 1 , 0 , 1 , 1 , 1},
            {0 , 0 , 0 , 0 , 0 , 1 , 0},
            {0 , 1 , 0 , 0 , 0 , 0 , 0},
        };
        System.out.println(printFloodfill(0,0,5,6,board,""));
    }
    static int printFloodfill(int sr, int sc, int er, int ec, int[][] board, String ans){
        if(sr == er && sc == ec){
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        board[sr][sc] = 1;
        if(sc+1 <= ec && board[sr][sc+1] == 0 ){
            count += printFloodfill(sr,sc+1,er,ec,board,ans+"R");
        }
        if(sc-1 >= 0 && board[sr][sc-1] == 0 ){
            count += printFloodfill(sr,sc-1,er,ec,board,ans+"L");
        }
        if(sr+1 <= er && board[sr+1][sc] == 0 ){
            count += printFloodfill(sr+1,sc,er,ec,board,ans+"D");
        }
        if(sr-1 >= 0 && board[sr-1][sc] == 0 ){
            count += printFloodfill(sr-1,sc,er,ec,board,ans+"U");
        }
        board[sr][sc] = 0;
        return count ;
    }
}