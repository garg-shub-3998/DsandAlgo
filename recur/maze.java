import java.util.*;

public class maze{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int sr = scn.nextInt();
        int sc = scn.nextInt();
        ArrayList<String> ans = mp(sr,sc,r,c);
        System.out.println(ans);
        System.out.println(ans.size());
        System.out.println("\n" + mp2(sr,sc,r,c,""));
        scn.close();
    }
    static ArrayList<String> mp(int sr, int sc, int r, int c){
        if(sr == r && sc == c){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(sc+1 <= c){
            ArrayList<String> horizontal = mp(sr,sc+1,r,c);
            for(String h : horizontal){
                ans.add('H'+h);
            }
        }
        if(sr+1 <= r){
            ArrayList<String> vertical = mp(sr+1,sc,r,c);
            for(String v : vertical){
                ans.add('V'+v);
            }
        }
        return ans;
    }
    static int mp2(int sr, int sc, int r, int c, String ans){
        if(sr == r && sc == c){
            System.out.print(ans + " ");
            return 1;
        }
        int count = 0;
        if(sc+1 <= c){
            count += mp2(sr,sc+1,r,c,ans+"H");
        }
        if(sr+1 <= r){
            count += mp2(sr+1,sc,r,c,ans+"V");
        }
        return count;
    }
}