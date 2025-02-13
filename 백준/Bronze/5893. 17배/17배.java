import java.io.*;
import java.math.*;
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter o=new BufferedWriter(new OutputStreamWriter(System.out));
        String s=b.readLine();
        BigInteger n = new BigInteger(s, 2);
        BigInteger r= n.multiply(BigInteger.valueOf(17));
        o.write(r.toString(2));
        o.close();
    }
}