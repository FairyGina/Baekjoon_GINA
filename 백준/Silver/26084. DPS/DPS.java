import java.io.*;
import java.util.*;
class Main{
    static long cb(int m,int n){
        if(m<n) return 0;
        return ft(m,Math.max(n,m-n))/ft(Math.min(n,m-n),1);
    }
    static long ft(int m,int n){
        long r=1;
        for(int i=m;i>n;i--) r*=i;
        return r;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int[] ap=new int[26],cp=new int[26];
        char[] ca=new char[3];
        String s=I.readLine();
        for(int i=0;i<3;i++){
            char c=s.charAt(i);
            cp[c-65]++;
            ca[i]=c;
        }
        int n=Integer.parseInt(I.readLine());
        for(int i=0;i<n;i++){
            s=I.readLine();
            ap[s.charAt(0)-65]++;
        }
        long res=1;
        for(char c:ca){
            int p=c-65;
            if(cp[p]>0){
                res*=cb(ap[p],cp[p]);
                cp[p]=-1;
            }
        }
        System.out.println(res);
    }
}