import java.util.*;

public class powLI{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(pow(n,p));
        sc.close();
    }
    static int pow(int n, int p){
        if(p == 1){
            return n;
        }
        return n * pow(n,p-1);
    }
}