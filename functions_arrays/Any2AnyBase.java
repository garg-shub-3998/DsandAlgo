import java.util.*;

public class Any2AnyBase{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int newN = 0;
        int multiplier = 1;

        while(n > 0){
            int rem = n%b2;
            n = n/b2;
            newN += rem*multiplier;
            multiplier *= b1;
        }

        System.out.println(newN);
    }
}