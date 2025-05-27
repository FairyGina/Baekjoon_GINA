import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(I.readLine());
        System.out.print(n%7==0||(n%7==2)?"CY":"SK");
    }
}