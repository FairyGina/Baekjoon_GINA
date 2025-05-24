import java.io.*;
import java.util.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(I.readLine());
        if(n==1){
            System.out.print(1);
            return;
        }

        int[] ip=new int[n],add=new int[n],mn=new int[n],dp=new int[n+1];
        Arrays.fill(dp,1001);
        dp[0]=0;

        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            ip[i]=Integer.parseInt(st.nextToken());
        }
        int mc=0;
        for(int i=0;i<n;i++){
            int ct=mc,v=ip[i];
            while(ct>=0){
                if(dp[ct]<v){
                    dp[ct+1]=Math.min(dp[ct+1],v);
                    break;
                }
                ct--;
            }
            if(ct==mc) mc++;
            add[i]=++ct;
        }

        mc=0;
        Arrays.fill(dp,1001);
        dp[0]=0;
        for(int i=n-1;i>-1;i--){
            int ct=mc,v=ip[i];
            while(ct>=0){
                if(dp[ct]<v){
                    dp[ct+1]=Math.min(dp[ct+1],v);
                    break;
                }
                ct--;
            }
            if(ct==mc) mc++;
            mn[i]=++ct;
        }

        mc=0;
        for(int i=0;i<n;i++){
            int sum=add[i]+mn[i]-1;
            if(mc<sum) mc=sum;
        }
        System.out.println(mc);
    }
}