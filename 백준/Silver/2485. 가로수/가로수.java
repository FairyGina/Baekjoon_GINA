import java.io.*;
class Main{
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(I.readLine());
        int[] ta=new int[t];
        for(int i=0;i<t;i++) ta[i]=Integer.parseInt(I.readLine());
        int l=ta.length,tj=ta[0],d=ta[1]-ta[0],a=0;
        for(int i=2;i<l;i++) d=gcd(d,ta[i]-ta[i-1]);
        for(int i=1;i<l;i++) a+=(ta[i]-ta[i-1])/d-1;
        O.write(a+"\n");
        O.flush();
    }
}