import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int[][] dp=new int[41][2];
        dp[0][0]=1; dp[1][1]=1;
        for(int i=2;i<41;i++){
            dp[i][0]=dp[i-1][0]+dp[i-2][0];
            dp[i][1]=dp[i-1][1]+dp[i-2][1];
        }
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int n=Integer.parseInt(I.readLine());
            as.append(dp[n][0]).append(' ').append(dp[n][1]).append('\n');
        }
        System.out.print(as);
    }
}