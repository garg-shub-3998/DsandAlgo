import java.util.*;

public class encoding{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(printEncoding(st,""));
    }
    static int printEncoding(String st, String ans){
         int count = 0;
         if(st.length() == 0){
             System.out.println(ans);
             return 1;
         }else if(st.length() == 1){
             char ch = st.charAt(0);
             if(ch == '0'){
                 return 0;
             }else{
                int chv = ch-'0';
                char code = (char)('A' + chv - 1);
                System.out.println(ans+code);
                return 1;
             }
         }else{
             char ch = st.charAt(0);
             String sub = st.substring(1);
             if(ch == '0'){
                 return 0;
             }else{
                int chv = ch-'0';
                char code = (char)('A' + chv - 1);
                count += printEncoding(sub,ans+code);
             }

             String ch12 = st.substring(0,2);
             String sub1 = st.substring(2);

             int ch12v = Integer.parseInt(ch12);
             if(ch12v <= 26){
                char code = (char)('A' + ch12v - 1);
                count += printEncoding(sub1,ans+code);
             }
         }
         
         return count;
    }
}