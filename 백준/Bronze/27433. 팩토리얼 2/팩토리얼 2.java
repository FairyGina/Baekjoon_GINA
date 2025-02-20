import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        long n=Integer.parseInt(I.readLine())+1,r=1;
        while(n-->2) r*=n;
        O.write(r+"\n");
        O.flush();
    }
}