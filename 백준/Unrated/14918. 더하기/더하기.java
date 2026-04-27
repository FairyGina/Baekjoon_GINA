import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(I.readLine());
        int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
        System.out.print(a+b);
    }
}