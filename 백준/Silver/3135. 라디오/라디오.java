import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
        int res=Math.abs(a-b);
        int n=Integer.parseInt(I.readLine());
        while(n-->0){
            int bt=Integer.parseInt(I.readLine());
            res=Math.min(Math.abs(b-bt)+1,res);
        }
        System.out.println(res);
    }
}