import java.io.*;
class Main{
    static int dt=0,n;
    static boolean bl=false;
    static void dfs(int n){
        if(n/10==0){
            if(n==3||n==6||n==9) bl=true;
            return;
        }
        int nb=n,res=0;
        while(nb>0){
            res+=nb%10;
            nb/=10;
        }
        dt++;
        dfs(res);
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        String s=I.readLine();
        int len=s.length(),n=0;
        if(len>1) dt++;
        for(int i=0;i<len;i++){
            n+=s.charAt(i)-'0';
        }
        dfs(n);
        System.out.println(dt);
        System.out.print(bl==true?"YES":"NO");  
    }
}