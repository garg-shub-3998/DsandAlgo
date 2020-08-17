import java.util.*;

public class lastidx{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        System.out.println(last_occ(arr,0,ele));
        sc.close();
    }
    static int last_occ(int[] arr,int idx, int ele){
        if(idx == arr.length){
            return -1;
        }
        int ans = last_occ(arr,idx+1,ele);

        if(ans == -1 && arr[idx] == ele){
            ans = idx;
        }

        return ans;

    }
}