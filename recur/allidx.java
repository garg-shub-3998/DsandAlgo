import java.util.*;

public class allidx{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        int[] A = all_index(arr,0,ele,0);
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        sc.close();
    }
    static int[] all_index(int[] arr,int idx,int ele,int fsf){
        if(idx == arr.length){
            int[] base = new int[fsf];
            return base;
        }
        if(arr[idx] == ele){
            int[] ans = all_index(arr,idx+1,ele,fsf+1);
            ans[fsf] = idx;
            return ans;
        }else{
            int[] ans = all_index(arr,idx+1,ele,fsf);
            return ans;
        }
    }
}