import java.util.*;

public class fac{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         System.out.println(printfac(n));
         sc.close();
    }
    static int printfac(int n){
        if(n <= 1){
            return 1;
        }
        return n * printfac(n-1);
    }
}