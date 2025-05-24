import java.io.*;
import java.util.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(I.readLine());

        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
        int[][] bag=new int[n][2];//0: 무게 1: 가치
        for(int i=0;i<n;i++){
            st=new StringTokenizer(I.readLine());
            bag[i][0]=Integer.parseInt(st.nextToken());
            bag[i][1]=Integer.parseInt(st.nextToken());
        }

        int[] dp=new int[k+1];
        for(int i=0;i<n;i++){
            int w=bag[i][0],v=bag[i][1];
            for(int j=k;j>=w;j--){
                dp[j]=Math.max(dp[j],dp[j-w]+v);
            }
        }
        int max=0;
        for(int i:dp){
            if(i>max) max=i;
        }
        System.out.println(max);
    }
}