import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine()),r=0;
        for(int i=2;i*i<=n;i++){
            for(int j=i*i;j<=n;j+=i) r++;
        }
        System.out.println(r+n);
    }
}