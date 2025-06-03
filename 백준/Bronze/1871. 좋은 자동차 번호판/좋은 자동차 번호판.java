import java.io.*;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        while(n-->0){
            StringTokenizer st=new StringTokenizer(I.readLine(),"-");
            String s=st.nextToken();
            int f=(s.charAt(0)-65)*26*26+(s.charAt(1)-65)*26+(s.charAt(2)-65);
            System.out.println(Math.abs(f-Integer.parseInt(st.nextToken()))<101?"nice":"not nice");
        }
    }
}