import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(s.nextToken());
        while(n!=0){
            int r=1;
            for(int i=0;i<n;i++) r=r*Integer.parseInt(s.nextToken())-Integer.parseInt(s.nextToken());
            O.write(r+"\n");
            s=new StringTokenizer(I.readLine());
            n=Integer.parseInt(s.nextToken());
        }
        O.flush();
    }
}