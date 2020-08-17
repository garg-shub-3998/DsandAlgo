import java.util.*;

public class max{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(max_arr(arr,0));
        sc.close();
    }
    static int max_arr(int[] arr,int idx){
        if(idx == arr.length){
            return Integer.MIN_VALUE;
        }
        int m = Math.max(arr[idx],max_arr(arr,idx+1));

        return m;
    }
}