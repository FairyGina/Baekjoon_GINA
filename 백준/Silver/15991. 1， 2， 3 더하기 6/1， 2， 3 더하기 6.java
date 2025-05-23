import java.io.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        long[] dp=new long[100001];
        dp[1]=1; dp[2]=2; dp[3]=2;
        dp[4]=3; dp[5]=3; dp[6]=6;

        int p=1000000009;
        for(int i=7;i<100001;i++){
            dp[i]=((dp[i-2]+dp[i-4])%p+dp[i-6])%p;
        }

        int t=Integer.parseInt(I.readLine());
    
        while(t-->0){
            int n=Integer.parseInt(I.readLine());
            as.append(dp[n]).append('\n');
        }
        System.out.print(as);
    }
}