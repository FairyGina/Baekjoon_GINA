import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));      
        String s=I.readLine();
        s=s.substring(0,5);
        int n=Integer.parseInt(I.readLine()),r=0;
        while(n-->0){
            if(I.readLine().substring(0,5).equals(s)) r++;
        }
        System.out.print(r);
    }
}