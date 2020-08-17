import java.util.*;

public class toHe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Toh(n,'A','B','C');
        sc.close();
    }
    static void Toh(int n, char a, char b, char c){
        if(n == 1){
            System.out.println(n + "from" + a + "->" + b);
            return;
        }
        Toh(n-1,a,c,b);
        System.out.println(n + "from" + a + "->" + b);
        Toh(n-1,c,b,a);
    }
}