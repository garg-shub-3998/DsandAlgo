import java.util.*;

public class keypad{
    static String[] keys = { "?!" , ".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz" };
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> ans = kp(str);
        System.out.println(ans);
        System.out.println(ans.size());
        System.out.println(kp2(str,""));
        sc.close();
    }
    static ArrayList<String> kp(String str){
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String sub = str.substring(1);
        ArrayList<String> subAns = kp(sub);
        ArrayList<String> ans = new ArrayList<>();
        for(String s: subAns){
            String st = keys[ch-'0'];
            for(int i = 0; i < st.length(); i++){
                char c = st.charAt(i);
                ans.add(c+s);
            }
        }
        return ans;
    }
    static int kp2(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + " ");
            return 1;
        }
        int count = 0;
        char ch = str.charAt(0);
        String sub = str.substring(1);
        String key = keys[ch-'0'];
        for(int i = 0; i < key.length(); i++){
            char k = key.charAt(i);
            count += kp2(sub,ans+k);
        }
        return count;
    }
}