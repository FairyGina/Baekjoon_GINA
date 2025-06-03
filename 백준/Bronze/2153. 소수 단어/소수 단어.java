import java.io.*;
class Main{
    static boolean pn(int n){
        if(n<4) return true;
        if(n%2==0||n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0||n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        String s=I.readLine();
        int len=s.length(),res=0;
        while(--len>-1){
            char c=s.charAt(len);
            if(c>96) res+=c-96;
            else if(c>64) res+=c-38;
        }
        System.out.print(pn(res)?"It is a prime word.":"It is not a prime word.");
    }
}