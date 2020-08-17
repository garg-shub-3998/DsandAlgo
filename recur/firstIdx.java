import java.util.*;

public class firstIdx{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        System.out.println(first_occ(arr,0,ele));
        sc.close();
    }
    static int first_occ(int[] arr,int idx,int ele){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == ele){
            return idx;
        }
        return first_occ(arr,idx+1,ele);
    }
}