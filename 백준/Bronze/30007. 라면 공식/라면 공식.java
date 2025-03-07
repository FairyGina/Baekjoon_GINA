import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        while(n-->0){
            StringTokenizer s=new StringTokenizer(I.readLine());
            int a=Integer.parseInt(s.nextToken()),b=Integer.parseInt(s.nextToken()),x=Integer.parseInt(s.nextToken());
            O.write(a*(x-1)+b+"\n");
        }
        O.flush();
    }
}