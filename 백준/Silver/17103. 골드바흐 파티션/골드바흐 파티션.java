import java.io.*;
class Main{
    static boolean[] b=new boolean[1000001];
    public static boolean iP(int n){
        if(n%2==0||n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0||n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(I.readLine());
        b[2]=true; b[3]=true;
        for(int i=5;i<1000001;i++) b[i]=iP(i);
        while(t-->0){
            int n=Integer.parseInt(I.readLine()),r=0;
            int l=n/2;
            for(int i=2;i<=l;i++){
                if(b[i]&&b[n-i]) r++;
            }
            O.write(r+"\n");
        }
        O.flush();
    }
}