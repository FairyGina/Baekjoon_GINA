import java.io.*;
import java.util.*;
class Main{
    static long sum(String s){
        int l=s.length();
        long r=0;
        while(--l>-1){
            r+=s.charAt(l)-'0';
        }
        return r;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        System.out.print(sum(st.nextToken())*sum(st.nextToken()));
    }
}