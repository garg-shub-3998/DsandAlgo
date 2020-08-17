import java.util.*;

public class inc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printinc(n);
        sc.close();
    }
    static void printinc(int n){
        if(n == 0){
            return;
        }
        printinc(n-1);
        System.out.println(n);
    }
}