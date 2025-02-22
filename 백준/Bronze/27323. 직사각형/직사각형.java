import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int a=Integer.parseInt(I.readLine()),b=Integer.parseInt(I.readLine());
        O.write(a*b+"\n");
        O.flush();
    }
}