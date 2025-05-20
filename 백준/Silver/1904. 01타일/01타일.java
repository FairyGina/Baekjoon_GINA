import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        long[] dp=new long[1000001];
        dp[1]=1; dp[2]=2;
        for(int i=3;i<1000001;i++){
            dp[i]=(dp[i-2]+dp[i-1])%15746;
        }
        int n=Integer.parseInt(I.readLine());
        System.out.print(dp[n]);
    }
}