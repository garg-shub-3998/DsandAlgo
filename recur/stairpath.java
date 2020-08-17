import java.util.*;

public class stairpath{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = sp(n);
        System.out.println(ans);
        System.out.println(ans.size());
        System.out.println("\n" + sp2(n,""));
        sc.close();
    }
    static ArrayList<String> sp(int n){
        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i <= 3 && n-i >= 0; i++){
            ArrayList<String> sub = sp(n-i);
            for(String s : sub){
                ans.add(i+s);
            }
        }
        return ans;
    }
    static int sp2(int n, String ans){
        if(n == 0){
            System.out.print(ans + " ");
            return 1;
        }
        int count = 0;
        for(int i = 1; i <= 3 && n-i >= 0; i++){
            count += sp2(n-i,i+ans); 
        }
        return count;
    }
}