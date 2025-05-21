import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        int[] dp=new int[n+1];
        int max=-1001;
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1]+Integer.parseInt(st.nextToken());
            max=Math.max(dp[i],max);
            if(dp[i]<0) dp[i]=0;
        }
        System.out.print(max);
    }
}