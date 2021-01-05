import java.util.*;

public class Decimal2AnyBase{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int newN = 0;
        int multiplier = 1;

        while(n > 0){
            int rem = n%b;
            n = n/b;
            newN += rem*multiplier;
            multiplier *= 10;
        }

        System.out.println(newN);
    }
}