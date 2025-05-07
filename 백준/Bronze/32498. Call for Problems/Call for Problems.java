import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(I.readLine()),r=0;
        while(t-->0){
            int n=Integer.parseInt(I.readLine());
            r+=(n%2!=0?1:0);
        }
        System.out.println(r);
    }
}