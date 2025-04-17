import java.io.*;
import java.util.*;
class Main{
    public static long gcd(long a,long b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer s=new StringTokenizer(I.readLine());
        long a=Long.parseLong(s.nextToken()),b=Long.parseLong(s.nextToken());
        O.write(a/gcd(a,b)*b+"\n");
        O.flush();
    }
}