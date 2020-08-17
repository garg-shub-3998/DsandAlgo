import java.util.*;

public class fib{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pfib(n,new int[n+1]));
    }
    static int pfib(int n, int[] qb){
        if( n <= 1){
            return n;
        }
        if(qb[n] != 0){
            return qb[n];
        }
        
        int ans = pfib(n-1,qb) + pfib(n-2,qb);

        qb[n] = ans;
        return ans;

    }
}