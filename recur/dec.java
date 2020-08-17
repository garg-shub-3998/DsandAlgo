
import java.util.*;


public class dec{
    public static void main(String[] str){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printdec(n);
            sc.close();
    }

    static void printdec(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printdec(n-1);
    }
}