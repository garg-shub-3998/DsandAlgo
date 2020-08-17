import java.util.*;

public class prarr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        displayR(arr,0);
        sc.close();
    }
    static void displayR(int[] arr,int idx){
        if(idx == arr.length){
            return;
        }
        displayR(arr,idx+1);
        System.out.println(arr[idx]);
    }
}