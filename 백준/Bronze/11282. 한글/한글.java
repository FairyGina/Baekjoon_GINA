import java.io.*;
class Main{
    static boolean bl=true;
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(I.readLine())+44031;
        System.out.print((char)n);
    }
}