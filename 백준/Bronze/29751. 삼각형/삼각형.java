import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        int a=Integer.parseInt(s.nextToken()),b=Integer.parseInt(s.nextToken());
        O.write(String.format("%.1f\n",(double)a*b/2));
        O.flush();
    }
}