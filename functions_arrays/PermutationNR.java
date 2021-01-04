import java.util.*;

public class PermutationNR{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int fn = factorial(n);
        int fr = factorial(r);
        System.out.println(fn/fr);
    }

    static int factorial(int a){
        int temp = 1;
        for(int i = 2; i <= a; i++){
            temp *= i;
        }
        return temp;
    }
}