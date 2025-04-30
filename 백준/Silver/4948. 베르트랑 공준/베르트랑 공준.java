import java.io.*;
class Main{
    public static boolean iP(int n){
        if(n<4) return true;
        if(n%2==0||n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0||n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        while(n!=0){
            int l=2*n,r=0;
            for(int i=l;i>n;i--){
                if(iP(i)) r++;
            }
            as.append(r).append('\n');
            n=Integer.parseInt(I.readLine());
        }
        System.out.println(as);
    }
}