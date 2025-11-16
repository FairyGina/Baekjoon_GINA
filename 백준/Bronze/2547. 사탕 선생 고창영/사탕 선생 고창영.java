import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(I.readLine());
        for(int i=0;i<t;i++){
            long num=0;
            String q=I.readLine();
            long n=Long.parseLong(I.readLine());
            for(int j=0;j<n;j++){
                long candy=Long.parseLong(I.readLine());
                num=(num+candy)%n;
            }
            if(num%n==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}