import java.io.*;
import java.util.*;
class Main{
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder a=new StringBuilder();
        StringTokenizer s=new StringTokenizer(I.readLine());
        int q=Integer.parseInt(s.nextToken()),w=Integer.parseInt(s.nextToken()),m=100000000,x=0,y=0,ax=0,ay=0,e=w/q;
        for(int i=1;i*i<=e;i++){
            x=i*q; y=w/i;
            int t=x+y;
            if(e%i==0&&t<m&&gcd(x,y)==q){
                ax=x; ay=y;
                m=t;
            }
        }
        a.append(ax).append(' ').append(ay);
        O.write(a+"\n");
        O.flush();
    }
}