import java.io.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        long[] dp=new long[1000001];
        int p=1000000009;
        dp[1]=1; dp[2]=2; dp[3]=4;
        for(int i=4;i<1000001;i++){
            dp[i]=((dp[i-1]+dp[i-2])%p+dp[i-3]%p)%p;
        }
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int n=Integer.parseInt(I.readLine());
            as.append(dp[n]).append('\n');
        }
        System.out.println(as);
    }
}