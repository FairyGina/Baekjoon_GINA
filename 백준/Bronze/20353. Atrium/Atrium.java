import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        System.out.print(Math.sqrt(Long.parseLong(I.readLine()))*4);
    }
}