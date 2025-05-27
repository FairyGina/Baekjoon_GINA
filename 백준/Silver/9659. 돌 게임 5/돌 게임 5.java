import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(I.readLine());
        System.out.print(n%2!=0?"SK":"CY");
    }
}