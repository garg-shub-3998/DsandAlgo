import java.util.*;

public class nqueens{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        System.out.println(printNqueen(board,"",0));
    }
    static int printNqueen(int[][] board, String ans, int row){
        if(row == board.length){
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        for(int col = 0; col < board[0].length; col++){
            if(ifSafePlace(board,row,col)){
                board[row][col] = 1;
                count += printNqueen(board,ans+row+"-"+col+", ",row+1);
                board[row][col] = 0;
            }
        }
        return count;
    }
    static boolean ifSafePlace(int[][] board, int row, int col){
        for(int i = row-1, j = col; i >= 0; i--){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--,j++){
            if(board[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}