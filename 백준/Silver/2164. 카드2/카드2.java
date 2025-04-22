import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine()),r=1;
        while(r<=n) r*=2;
        r/=2;
        if(r<n) r=(n-r)*2;
        else if(n==1) r=1;
        System.out.println(r);
    }
}