import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        while(n-->0){
            double r=1;
            StringTokenizer s=new StringTokenizer(I.readLine());
            for(int i=0;i<3;i++) r*=Double.parseDouble(s.nextToken());
            O.write(String.format("$%.2f%n",r));
        }
        O.flush();
    }
}