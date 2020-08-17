import java.util.*;

public class maze2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int sr = scn.nextInt();
        int sc = scn.nextInt();
        ArrayList<String> ans = mp2(sr,sc,r,c);
        System.out.println(ans);
        System.out.println(ans.size());
        scn.close();
    }
    static ArrayList<String> mp2(int sr,int sc,int r,int c){
        if(sc==c && sr==r){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; sc+i <= c; i++){
            ArrayList<String> horizontal = mp2(sr,sc+i,r,c);
            for(String h : horizontal){
                ans.add("H"+i+h);
            }
        }
        for(int i = 1; sr+i <= r ; i++){
            ArrayList<String> vertical = mp2(sr+i,sc,r,c);
            for(String v : vertical){
                ans.add("V"+i+v);
            }
        }
        for(int i = 1; sc+i<=c && sr+i<=r; i++){
            ArrayList<String> digonal = mp2(sr+i,sc+i,r,c);
            for(String d : digonal){
                ans.add("D"+i+d);
            }
        }
        return ans;
    }
}