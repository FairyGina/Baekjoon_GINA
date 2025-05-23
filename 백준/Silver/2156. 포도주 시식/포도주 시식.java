import java.io.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(I.readLine());
        int[] gp=new int[n+1];
        int[] dp=new int[n+1];

        for(int i=1;i<=n;i++){
            gp[i]=Integer.parseInt(I.readLine());
        }
        if(n==1){
            System.out.print(gp[1]);
            return;
        }else if(n==2){
            System.out.print(gp[1]+gp[2]);
            return;
        }

        dp[1]=gp[1];
        dp[2]=gp[1]+gp[2];
        for(int i=3;i<=n;i++){
            dp[i]=Math.max(dp[i-3]+gp[i-1],dp[i-2]);
            dp[i]+=gp[i];
            dp[i]=Math.max(dp[i],dp[i-1]);
        }
        System.out.print(dp[n]);
    }
}