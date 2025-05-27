import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        boolean b=true;
        if(n%7==0||(n-2)%7==0) b=false;
        System.out.print(b==true?"SK":"CY");
    }
}