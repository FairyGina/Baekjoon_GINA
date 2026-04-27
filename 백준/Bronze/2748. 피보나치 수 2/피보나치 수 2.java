import java.io.*;
class Main{
    static int ct=1,n;
    static long fb(long a,long b){
        if(++ct>=n) return a+b;
        return fb(b,a+b);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        n=Integer.parseInt(I.readLine());
        System.out.print(fb(0,1));
    }
}