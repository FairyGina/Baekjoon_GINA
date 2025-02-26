import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        long n=Long.parseLong(I.readLine());
        O.write(n*(n-1)*(n-2)/6+"\n3");
        O.flush();
    }
}