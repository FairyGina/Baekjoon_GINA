import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(I.readLine());
        System.out.print((n+1)*((n*n-n)/2));
    }
}