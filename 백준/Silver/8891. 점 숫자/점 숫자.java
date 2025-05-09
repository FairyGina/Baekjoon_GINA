import java.io.*;
import java.util.*;
class Main{
    static int ag=20001;
    static int[] dp=new int[ag];
    static int bs(int n){
        int l=1,r=ag-1;
        while(!(r-l==1)){
            int m=(l+r)/2;
            
            if(dp[m]==n){
                // System.out.println("dp: "+dp[3]);
                // System.out.println("중앙값: "+m);
                return m;
            } 
            if(dp[m]>n) r=m;
            else l=m;
        }
        //System.out.println("중앙값: "+r);
        return r;
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
            
            int x=0,y=0;
            
            int id=bs(a);
            int ms=dp[id]-a;
            x+=id-1-ms;
            y+=1+ms;

            id=bs(b);
            ms=dp[id]-b;
            x+=id-1-ms;
            y+=1+ms;

            as.append(dp[x+y]-y+1).append('\n');
        }
        System.out.println(as);
    }
}