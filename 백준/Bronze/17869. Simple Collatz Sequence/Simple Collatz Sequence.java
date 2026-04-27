import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(I.readLine());
        int ct=0;
        while(n>1){
            if(n%2==0)n/=2;
            else n++;
            ct++;
        }
        System.out.print(ct);
    }
}