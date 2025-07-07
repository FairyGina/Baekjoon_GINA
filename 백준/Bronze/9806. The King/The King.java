import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine()),p=Integer.parseInt(I.readLine()),res=0;
        StringTokenizer st=new StringTokenizer(I.readLine());
        if(p%2==0){
            while(n-->0){
                res+=Math.pow(Integer.parseInt(st.nextToken()),p);
            }
        }else{
            while(n-->0){
                int t=Integer.parseInt(st.nextToken());
                if(t>0) res+=Math.pow(t,p);
            }
        }
        System.out.print(res);
    }
}