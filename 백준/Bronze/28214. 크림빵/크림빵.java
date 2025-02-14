import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(s.nextToken()),k=Integer.parseInt(s.nextToken()),p=Integer.parseInt(s.nextToken()),r=0;
        s=new StringTokenizer(I.readLine());
        while(n-->0){
            int b=0;
            for(int i=0;i<k;i++) b+=Integer.parseInt(s.nextToken());
            if(b>k-p) r++;
        }
        O.write(Integer.toString(r));
        O.close();
    }
}