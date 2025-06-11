import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int k=Integer.parseInt(I.readLine()),n=Integer.parseInt(I.readLine());
        int i=0;
        while(++i<n){
            as.append(i).append('\n');
        }
        as.append(k-i*(i-1)/2);
        System.out.print(as);
    }
}