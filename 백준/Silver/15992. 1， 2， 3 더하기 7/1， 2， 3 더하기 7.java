import java.io.*;
import java.util.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        long[][] dp=new long[1001][1001];
        dp[1][1]=1; dp[2][1]=dp[2][2]=1; dp[3][1]=dp[3][3]=1; dp[3][2]=2;

        int p=1000000009;
        for(int i=4;i<1001;i++){
            for(int j=2;j<i;j++){
                dp[i][j]=((dp[i-1][j-1]+dp[i-2][j-1])%p+dp[i-3][j-1])%p;
            }
            dp[i][i]=1;
        }

        int t=Integer.parseInt(I.readLine());
    
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            as.append(dp[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]).append('\n');
        }
        System.out.print(as);
    }
}