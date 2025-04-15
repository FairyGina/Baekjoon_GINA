import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(I.readLine()),r=0;
        int n=Integer.parseInt(I.readLine());
        StringTokenizer s=new StringTokenizer(I.readLine());
        while(n-->0) r+=Integer.parseInt(s.nextToken());
        O.write((t>r?"Padaeng_i Cry":"Padaeng_i Happy")+"\n");
        O.flush();
    }
}