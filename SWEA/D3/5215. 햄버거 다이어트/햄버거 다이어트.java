import java.io.*;
import java.util.*;
class Solution{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        int ti=Integer.parseInt(I.readLine());
        for(int t=1;t<=ti;t++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int n=Integer.parseInt(st.nextToken()),l=Integer.parseInt(st.nextToken());

            int[][] food=new int[n][2];
            int[] dp=new int[l+1];

            for(int i=0;i<n;i++){
                st=new StringTokenizer(I.readLine());
                food[i][1]=Integer.parseInt(st.nextToken());
                food[i][0]=Integer.parseInt(st.nextToken());
            }

            Arrays.sort(food,Comparator.comparingInt(a->a[0]));

            for(int i=0;i<n;i++){
                int kal=food[i][0];
                int taste=food[i][1];
                for(int j=l;j>=kal;j--){
                    dp[j]=Math.max(dp[j],dp[j-kal]+taste);
                }
            }

            int max=0;
            for(int i:dp){
                if(max<i) max=i;
            }
            String ass=String.format("#%d %d\n",t,max);
            as.append(ass);
        }
        System.out.println(as);
    }
}