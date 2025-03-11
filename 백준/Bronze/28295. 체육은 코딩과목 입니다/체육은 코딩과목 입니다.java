import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        char[] c={'N','E','S','W'};
        int r=0;
        for(int i=0;i<10;i++) r+=Integer.parseInt(I.readLine());
        O.write(c[r%4]+"\n");
        O.flush();
    }
}