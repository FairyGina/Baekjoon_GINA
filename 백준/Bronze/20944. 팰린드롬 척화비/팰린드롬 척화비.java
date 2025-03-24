import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        StringBuilder s=new StringBuilder();
        while(n-->0) s.append('a');
        O.write(s+"\n");
        O.flush();
    }
}