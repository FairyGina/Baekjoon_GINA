import java.io.*;
import java.util.*;
class Main{
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        int q=Integer.parseInt(s.nextToken()),w=Integer.parseInt(s.nextToken());
        s=new StringTokenizer(I.readLine());
        int e=Integer.parseInt(s.nextToken()),r=Integer.parseInt(s.nextToken());
        int x=q*r+e*w,y=w*r,g=gcd(x,y);
        O.write(x/g+" "+y/g+"\n");
        O.flush();
    }
}