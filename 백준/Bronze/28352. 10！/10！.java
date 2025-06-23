import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(I.readLine()),res=6;
        for(int i=11;i<=n;i++){
            res*=i;
        }
        System.out.print(res);
    }
}