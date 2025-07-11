import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder("YES\n");
        String ksa=I.readLine();
        int len=ksa.length(),n=Integer.parseInt(ksa.substring(2,len)),m=1;
        for(int i=2;i<len;i++) m*=10;
        as.append(n).append(' ').append(m);
        System.out.print(as);
    }
}