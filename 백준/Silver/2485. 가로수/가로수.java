import java.io.*;
import java.util.*;

class Main{
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(I.readLine());
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<t;i++){
            ts.add(Integer.valueOf(I.readLine()));
        }
        Integer[] ta=ts.toArray(new Integer[0]);
        ts=null;
        int l=ta.length,tj=ta[0],d=ta[1]-ta[0],a=0;
        for(int i=1;i<l;i++){
            int ti=ta[i];
            int p=ti-tj;
            d=gcd(d,p);
            tj=ti;
        }
        for(int i=1;i<l;i++){
            a+=(ta[i]-ta[i-1])/d-1;
        }
        O.write(a+"\n");
        O.flush();
    }
}