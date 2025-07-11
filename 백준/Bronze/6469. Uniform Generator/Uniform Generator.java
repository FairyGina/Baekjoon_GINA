import java.io.*;
import java.util.*;
public class Main{
    static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s;
        while((s=I.readLine())!=null){
            StringTokenizer st=new StringTokenizer(s);
            int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
            as.append(String.format("%10d%10d ",a,b));
            as.append(gcd(a,b)>1?"Bad":"Good").append(" Choice\n\n");
        }
        System.out.print(as);
    }
}