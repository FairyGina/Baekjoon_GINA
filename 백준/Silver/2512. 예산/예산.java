import java.io.*;
import java.util.*;

class Main{
    static int[] lc;
    static int n;
    public static int fd(int as){
        int l=0,r=n-1,md=0;
        while(l<=r){
            md=(l+r)/2;
            if(lc[md]<as){
                l=md+1;
            }else if(lc[md]>as){
                r=md-1;
            }else break;
        }
        return (l+r)/2;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(I.readLine());
        lc=new int[n];
        StringTokenizer s=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++) lc[i]=Integer.parseInt(s.nextToken());
        Arrays.sort(lc);
        int[] nu=lc.clone();
        for(int i=1;i<n;i++) nu[i]+=nu[i-1];
        int cs=Integer.parseInt(I.readLine()),mn=0,mx=nu[n-1];
        int as=0;
        while(mn<=mx){
            as=(mn+mx)/2;
            int md=fd(as);
            int t=nu[md]+as*(n-md-1);
            if(t<cs){
                mn=as+1;
            }else if(t>cs){
                mx=as-1;
            }else break;
        }
        as=(mn+mx)/2;
        if(cs/n<lc[0]){
            as=cs/n;
        }else if(as>lc[n-1]){
            as=lc[n-1];
        }
        System.out.println(as);
        
    }
}