import java.io.*;
import java.util.*;
class Main{
    static int ag=20001,x=0,y=0;
    static int[] dp=new int[ag];
    static int bs(int n){
        int l=1,r=ag-1;
        while(!(r-l==1)){
            int m=(l+r)/2;
            if(dp[m]==n) return m;
            if(dp[m]>n) r=m;
            else l=m;
        }
        return r;
    }
    static void fc(int n){
        int id=bs(n);
        int ms=dp[id]-n;
        x+=id-1-ms;
        y+=1+ms;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        for(int i=2;i<ag;i++){ //dp 준비
            dp[i]=i+dp[i-1]-1;
        }
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
            x=0; y=0;
            fc(a); fc(b);
            as.append(dp[x+y]-y+1).append('\n');
        }
        System.out.println(as);
    }
}