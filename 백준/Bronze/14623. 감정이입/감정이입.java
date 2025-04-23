import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        Long a=Long.valueOf(I.readLine(),2),b=Long.valueOf(I.readLine(),2);
        System.out.println(Long.toBinaryString(a*b));
    }
}