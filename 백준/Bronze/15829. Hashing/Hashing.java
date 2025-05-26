import java.io.*;
class Main{
    static int ft(int n,int dt){
        if(dt==0) return n;
        n=n*31%1234567891;
        return ft(n,dt-1);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        String s=I.readLine();
        int res=0;
        for(int i=0;i<n;i++){
            res+=ft(s.charAt(i)-96,i)%1234567891;
        }
        System.out.print(res%1234567891);
    }
}