import java.io.*;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        double w=Integer.parseInt(st.nextToken()),h=Integer.parseInt(st.nextToken()),n=Integer.parseInt(st.nextToken());
        if(n%2==0) h*=(n-2)/2;
        else h*=(n-1)*(n-1)/(2*n);
        System.out.println(String.format("%.6f",h));
    }
}