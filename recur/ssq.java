import java.util.*;

public class ssq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        ArrayList<String> result = gssq(str);
        System.out.println(result);
        System.out.println(result.size());
        System.out.println(pssq(str,""));
        sc.close();
    }
    static ArrayList<String> gssq(String str){
        
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String substr = str.substring(1);
        ArrayList<String> subresult = gssq(substr);
        ArrayList<String> result = new ArrayList<>();

        for(String s: subresult){
            result.add(s);
            result.add(ch+s);
        }
        return result;
    }
    static int pssq(String str,String ans){
        if(str.length() == 0){
            System.out.print(ans + " ");
            return 1;
        }
        char ch = str.charAt(0);
        String substr = str.substring(1);
        int count = 0;
        count += pssq(substr,ans);
        count += pssq(substr,ans+ch);
        return count;
    }
}