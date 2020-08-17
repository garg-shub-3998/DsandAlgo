import java.util.*;

public class incdec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdi(n);
        sc.close();
    }
    static void printdi(int n){
        System.out.println(n);
        if(n == 1){
            return;
        }
        printdi(n-1);
        System.out.println(n);
    }
}