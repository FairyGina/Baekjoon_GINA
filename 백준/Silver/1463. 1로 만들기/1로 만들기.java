import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        System.out.println(d(n,0));
    }
    static int d(int n,int c){
        if(n<2) return c;
        return Math.min(d(n/2,c+1+n%2),d(n/3,c+1+n%3));
    }
}