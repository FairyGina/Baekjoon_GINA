import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        long[] dp=new long[101];
        dp[1]=1; dp[2]=1; dp[3]=1;
        for(int i=4;i<101;i++){
            dp[i]=dp[i-3]+dp[i-2];
        }

        int t=Integer.parseInt(I.readLine());
        StringBuilder as=new StringBuilder();
        while(t-->0){
            as.append(dp[Integer.parseInt(I.readLine())]).append('\n');
        }
        
        System.out.print(as);
    }
}