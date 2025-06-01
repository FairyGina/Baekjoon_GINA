import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        String a=st.nextToken(),b=st.nextToken();
        int al=a.length(),bl=b.length();
        long res=0;
        while(--bl>-1){
            int tb=b.charAt(bl)-'0';
            for(int i=0;i<al;i++){
                int ta=a.charAt(i)-'0';
                res+=ta*tb;
            }
        }
        System.out.print(res);
    }
}