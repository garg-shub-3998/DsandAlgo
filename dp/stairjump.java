import java.util.*;

public class stairjump{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sj(n));
        sc.close();
    }
    static int sj(int n){
        int[] arr = new int[n+1];
        arr[0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=3 && i-j>=0; j++){
                arr[i] += arr[i-j];
            }
        }
        return arr[n];
    }
}