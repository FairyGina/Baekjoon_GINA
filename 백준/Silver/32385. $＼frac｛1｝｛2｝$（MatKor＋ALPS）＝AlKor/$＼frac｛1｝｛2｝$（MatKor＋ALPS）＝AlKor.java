import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        int sq=n*n,lm=sq-n,res=0;
        for(int i=0;i<lm;i+=n){
            res+=i/n;
            as.append(i).append(' ');
        }
        as.append(sq).append(' ').append(res+sq/n);
        System.out.print(as);
    }
}