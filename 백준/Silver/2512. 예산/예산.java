import java.io.*;
import java.util.*;
class Main{
    static int[] lc;
    static int n;
    public static int ub(int as){
        int l=0,r=n;
        while(l<r){
            int m=(l+r)/2;
            if(lc[m]<=as) l=m+1;
            else r=m;
        }
        return l-1;
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
        int cs=Integer.parseInt(I.readLine()),mn=0,mx=lc[n-1],as=0;
        while(mn<=mx){
            int md=(mn+mx)/2;
            int p=ub(md);
            int t=(p<0?0:nu[p])+md*(n-p-1);
            if(t<=cs){
                as=md;
                mn=md+1;
            }else{
                mx=md-1;
            }
        }
        System.out.println(as);
    }
}