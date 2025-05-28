import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        int[][] human=new int[n][2];
        int[] dp=new int[100];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            human[i][0]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            human[i][1]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++){
            int l=human[i][0],g=human[i][1];
            for(int j=99;j>=l;j--){
                dp[j]=Math.max(dp[j],dp[j-l]+g);
            }
        }
        System.out.print(dp[99]);
    }
}