import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        int res=n*(n+1)/2;
        as.append(res).append('\n');
        res*=res;
        as.append(res).append('\n').append(res);
        System.out.print(as);
    }
}