import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),day=0;
        n/=a;
        while(k>0){
            day++;
            k--;
            if(day%n==0) k+=b;
        }
        System.out.print(day);
    }
}