import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(I.readLine()),num=0;
        StringTokenizer st=new StringTokenizer(I.readLine());
        while(t-->0){
            num+=Integer.parseInt(st.nextToken());
        }
        System.out.print(num%3==0?"yes":"no");
    }
}