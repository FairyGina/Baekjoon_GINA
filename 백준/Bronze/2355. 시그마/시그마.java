import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        long a=Long.parseLong(st.nextToken()),b=Long.parseLong(st.nextToken());
        long mx=Math.max(a,b),mn=Math.min(a,b);
        if(mx>=0&&mn<0) mn=Math.abs(mn)+1;
        System.out.print((mx*mx+mx-mn*mn+mn)/2);
       
    }
}