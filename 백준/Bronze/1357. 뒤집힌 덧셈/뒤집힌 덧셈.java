import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        StringBuilder a=new StringBuilder(st.nextToken()).reverse(),
        b=new StringBuilder(st.nextToken()).reverse();
        int sum=Integer.parseInt(String.valueOf(a))+Integer.parseInt(String.valueOf(b));
        a=new StringBuilder(String.valueOf(sum)).reverse();
        System.out.print(Integer.parseInt(String.valueOf(a)));
    }
}