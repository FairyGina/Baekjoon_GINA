import java.io.*;
import java.util.StringTokenizer;
class Main{
    static boolean ck(String s,String b){
        int f=(s.charAt(0)-65)*26*26+(s.charAt(1)-65)*26+(s.charAt(2)-65);
        return Math.abs(f-Integer.parseInt(b))<101;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        while(n-->0){
            StringTokenizer st=new StringTokenizer(I.readLine(),"-");
            System.out.println(ck(st.nextToken(),st.nextToken())?"nice":"not nice");
        }
    }
}