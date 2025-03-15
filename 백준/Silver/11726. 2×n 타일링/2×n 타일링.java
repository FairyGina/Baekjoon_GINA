import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        long d[]=new long[1001];
        d[1]=1; d[2]=2;
        for(int i=3;i<1001;i++) d[i]=(d[i-1]+d[i-2])%10007;
        O.write(d[Integer.parseInt(I.readLine())]+"\n");
        O.flush();
    }
}