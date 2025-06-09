import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        Long n=Long.parseLong(I.readLine());
        int lm=1500000;
        long[] dp=new long[lm+1];
        dp[1]=1;
        for(int i=2;i<=lm;i++){
            dp[i]=(dp[i-1]+dp[i-2])%1000000;
        }
        System.out.print(dp[(int)(n%lm)]);
    }
}