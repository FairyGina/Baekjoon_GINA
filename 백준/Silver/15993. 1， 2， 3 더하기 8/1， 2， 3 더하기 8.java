import java.io.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        long[][] dp=new long[100001][3];

        dp[1][1]=1; dp[2][1]=dp[2][0]=1; dp[3][1]=2; dp[3][0]=2;
        int p=1000000009;
        for(int i=4;i<100001;i++){
            dp[i][0]=((dp[i-1][1]+dp[i-2][1])%p+dp[i-3][1])%p;
            dp[i][1]=((dp[i-1][0]+dp[i-2][0])%p+dp[i-3][0])%p;
        }

        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int n=Integer.parseInt(I.readLine());
            as.append(String.format("%d %d\n",dp[n][1],dp[n][0]));
        }
        System.out.print(as);
    }
}