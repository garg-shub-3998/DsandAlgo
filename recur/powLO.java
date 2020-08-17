import java.util.*;

public class powLO{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(pow(n,p));
        sc.close();
    }
    static int pow(int n, int p){
        if(p == 0){
            return 1;
        }

        int temp = pow(n,p/2);
        if(p%2 == 0){
            return temp*temp;
        }else{
            return temp*temp*n;
        }
    }
}