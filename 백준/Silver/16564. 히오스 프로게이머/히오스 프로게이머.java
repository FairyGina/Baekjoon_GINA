import java.io.*;
import java.util.*;

class Main{
    static int n;
    static long k;
    static long bs(){
        long l=0,r=1000000001;
        while(l<=r){
            long m=(l+r)/2,cn=n*m;
            if(cn<k) l=m+1;
            else if(cn>k) r=m-1;
            else return m;
        }
        return r;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        long[] nb=new long[n],num=new long[n+1];

        for(int i=0;i<n;i++) nb[i]=Integer.parseInt(I.readLine());
        Arrays.sort(nb);
        for(int i=0;i<n;i++) num[i+1]=num[i]+nb[i];
        boolean bl=true;
        
        for(int i=0;i<n;i++){
            if(k<nb[i]*i-num[i]){
                k+=num[i];
                n=i;
                bl=false;
                break;
            }
        }
        if(bl) k+=num[n];
        System.out.print(bs());
    }
}