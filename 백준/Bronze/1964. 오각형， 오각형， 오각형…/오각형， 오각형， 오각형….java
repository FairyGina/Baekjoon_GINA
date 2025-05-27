import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        int t=45678;
        long res=0;
        if(n%2!=0){
            res=((((3*n+5)/2)%t)*(n%t)+1)%t;
        }else{
            res=((n/2%t)*((3*n+5)%t)+1)%t;
        }
        System.out.print(res);
    }
}