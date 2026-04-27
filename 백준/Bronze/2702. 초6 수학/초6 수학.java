import java.io.*;
import java.util.*;
class Main{
    static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
            int g=gcd(a,b);
            as.append(a/g*b).append(' ').append(g).append('\n');
        }
        System.out.print(as);
    }
}