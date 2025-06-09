import java.io.*;
import java.math.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BigInteger a=new BigInteger("0"),b=new BigInteger("1"),r;

        int n=Integer.parseInt(I.readLine());
        for(int i=2;i<=n;i++){
            r=a.add(b);
            a=b;
            b=r;
        }
        System.out.print(n==0?0:b);
    }
}