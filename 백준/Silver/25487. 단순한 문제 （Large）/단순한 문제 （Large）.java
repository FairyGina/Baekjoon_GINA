import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(I.readLine());
        int[] n=new int[3];
        while(t-->0){
            StringTokenizer s=new StringTokenizer(I.readLine());
            for(int i=0;i<3;i++) n[i]=Integer.parseInt(s.nextToken());
            int m=n[0];
            if(m>n[1]) m=n[1]; if(m>n[2]) m=n[2];
            O.write(m+"\n");
        }
        O.flush();
    }
}