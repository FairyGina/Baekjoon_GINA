import java.io.*;
import java.util.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans=new StringBuilder();

        StringTokenizer st=new StringTokenizer(br.readLine());
        BigInteger bn1=new BigInteger(st.nextToken());
        BigInteger bn2=new BigInteger(st.nextToken());

        System.out.print(bn1.add(bn2));
    }
}