import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int p=Integer.parseInt(st.nextToken()),q=Integer.parseInt(st.nextToken());
            as.append(String.format("f = %.1f\n",(double)p*q/(p+q)));
        }
        System.out.print(as);
    }
}