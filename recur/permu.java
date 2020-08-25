import java.util.*;

public class permu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
       int count = printPermutation(st,"");
       System.out.println(count);
    }
    static int printPermutation(String st, String ans){
        if(st.length() == 0){
            System.out.println(ans);
            return 1;
        }

        int count = 0;

        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            String subst = st.substring(0,i)+st.substring(i+1);
            count += printPermutation(subst,ans+ch);
        }

        return count;
    }
}