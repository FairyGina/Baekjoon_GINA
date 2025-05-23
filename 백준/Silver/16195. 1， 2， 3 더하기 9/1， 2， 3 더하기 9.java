import java.io.*;
import java.util.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        long[][][] dp=new long[1001][1001][2];
        dp[1][1][0]=1; dp[2][1][0]=dp[2][2][0]=1; dp[3][1][0]=dp[3][3][0]=1; dp[3][2][0]=2;
        dp[1][1][1]=1; dp[2][1][1]=1; dp[2][2][1]=2; dp[3][1][1]=1; dp[3][3][1]=4; dp[3][2][1]=3;

        int p=1000000009;
        for(int i=4;i<1001;i++){
            long r=dp[i][1][1];
            dp[i][i][0]=1;
            for(int j=2;j<=i;j++){
                dp[i][j][0]=((dp[i-1][j-1][0]+dp[i-2][j-1][0])%p+dp[i-3][j-1][0])%p;
                r+=dp[i][j][0];
                r%=p;
                dp[i][j][1]=r;
            }
        }

        int t=Integer.parseInt(I.readLine());
    
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            as.append(dp[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())][1]).append('\n');
        }
        System.out.print(as);
    }
}