import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int[][] dp=new int[30][30];
        dp[1][1]=1;
        for(int i=0;i<30;i++){
            dp[i][0]=1;
            dp[i][1]=i;
        }
        for(int i=2;i<30;i++){
            for(int j=i;j<30;j++){
                dp[j][i]=dp[j-1][i]+dp[j-1][i-1];
            }
        }
        int t=Integer.parseInt(I.readLine());
        StringBuilder as=new StringBuilder();
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
            as.append(dp[m][n]).append('\n');
        }
        System.out.println(as);
    }
}