import java.io.*;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s=new StringTokenizer(I.readLine());
        String a;
        double r1=Double.parseDouble(s.nextToken())-1,r2=Double.parseDouble(s.nextToken())-1;
        r1/=Double.parseDouble(s.nextToken()); r2/=Double.parseDouble(s.nextToken());
        if(Math.abs(r2-r1)<0.000000001) a="SAME";
        else if(r1>r2) a="JAKARTA";
        else a="TAOYUAN";
        System.out.println(a);
    }
}