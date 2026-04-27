import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            double a=Double.parseDouble(st.nextToken()),b=Double.parseDouble(st.nextToken());
            double tg=a/b;
            as.append(Math.abs(1.61803399-tg)<0.01?"golden\n":"not\n");
        }
        System.out.print(as);
    }
}