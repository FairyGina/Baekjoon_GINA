import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        int a=Integer.parseInt(s.nextToken()),b=Integer.parseInt(s.nextToken());
        O.write((a>b?2*b+1:2*a-1)+"\n");
        O.flush();
    }
}