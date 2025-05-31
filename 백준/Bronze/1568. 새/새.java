import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(I.readLine());
        int pl=1,ct=0;
        while(n>0){
            if(n<pl) pl=1;
            n-=pl++;
            ct++;
        }
        System.out.print(ct);
    }
}