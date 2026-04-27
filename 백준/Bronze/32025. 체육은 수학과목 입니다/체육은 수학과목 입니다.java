import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        System.out.print(Math.min(Integer.parseInt(I.readLine())*100,Integer.parseInt(I.readLine())*100)/2);
    }
}