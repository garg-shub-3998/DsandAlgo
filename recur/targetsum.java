import java.util.*;

public class targetsum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int tsum = sc.nextInt();
        System.out.println(printTargetSumSubSet(arr,0,tsum,""));
    }
    static int printTargetSumSubSet(int[] arr, int idx, int tsum, String ans){
         if(tsum == 0){
             System.out.println(ans);
             return 1;
         }
         if(idx == arr.length){
             return 0;
         }
         int count = 0;
         count += printTargetSumSubSet(arr,idx+1,tsum-arr[idx],ans+arr[idx]);
         count += printTargetSumSubSet(arr,idx+1,tsum,ans);
         return count;
    }
}