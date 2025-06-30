import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine()),i=1;
        while(i*i<=n) i++;
        System.out.print(i-1);
    }
}