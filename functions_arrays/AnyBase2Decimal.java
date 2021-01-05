import java.util.*;

public class AnyBase2Decimal{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int newN = 0;
        int multiplier = 1;

        while( n > 0){
            int rem = n%10;
            n = n/10;
            newN += rem*multiplier;
            multiplier *= b;
        }

        System.out.println(newN);
    }
}