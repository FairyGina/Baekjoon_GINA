import java.io.*;
class Main{
    public static boolean ip(long n){
        if(n<2) return false;
        if(n<4) return true;
        if(n%2==0||n%3==0) return false;
        for(long i=5;i*i<=n;i+=6) if(n%i==0||n%(i+2)==0) return false;
        return true;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            long n=Long.parseLong(I.readLine());
            while(true){
                if(ip(n)){
                    as.append(n).append('\n');
                    break;
                }
                n++;
            }
        }
        System.out.println(as);
    }
}