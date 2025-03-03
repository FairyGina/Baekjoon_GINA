import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        String n=s.nextToken();
        int b=Integer.parseInt(s.nextToken()),z=1,r=0;
        for(int i=n.length()-1;i>=0;i--){
            int t=n.charAt(i);
            if(t>64) t-=55;
            else t-=48;
            r+=z*t;
            z*=b;
        }
        System.out.println(r);
    }
}