import java.io.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        int[][] dp=new int[n][3];
        for(int i=0;i<n;i++){
            dp[i][0]=Integer.parseInt(I.readLine());
        }
        int max=dp[0][0];
        if(n>1){
            dp[0][1]=dp[0][2]=max;
            dp[1][1]=max+dp[1][0];
            dp[1][2]=dp[1][0];
        }
        for(int i=2;i<n;i++){
            dp[i][1]=dp[i][0]+dp[i-1][2];
            dp[i][2]=dp[i][0]+max;
            max=Math.max(max,Math.max(dp[i-1][1],dp[i-1][2]));
        }
        System.out.print(Math.max(max,(Math.max(dp[n-1][1],dp[n-1][2]))));
    }
}