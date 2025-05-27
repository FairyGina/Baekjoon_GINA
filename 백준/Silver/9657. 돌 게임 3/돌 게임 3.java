import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        System.out.print((n%7==0||(n-2)%7==0)?"CY":"SK");
    }
}