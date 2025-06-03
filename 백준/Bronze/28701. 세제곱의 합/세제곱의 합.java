import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        int res=n*(n+1)/2;
        System.out.println(res);
        res*=res;
        System.out.print(res+"\n"+res);
    }
}