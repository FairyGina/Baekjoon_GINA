import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder as=new StringBuilder();

        int n=Integer.parseInt(I.readLine());
        int lm=2*n-1;
        for(int i=0;i<lm;i++){
            String s=I.readLine();
        }
        int len=2+2*(n-2);
        System.out.print(len+" "+(len-1));
    }
}