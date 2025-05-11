import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        int r=n/9+(n/9%2==0?0:-1);
        n%=18;
        if(n>9){
            r+=2;
            if(n%2!=0) r++;
        }else if(n>0) r++;
        System.out.println(r);
    }
}