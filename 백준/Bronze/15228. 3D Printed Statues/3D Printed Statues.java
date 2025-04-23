import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine()),b=1,r=1;
        while(b<n){
            b*=2;
            r++;
        }
        System.out.println(r);
    }
}