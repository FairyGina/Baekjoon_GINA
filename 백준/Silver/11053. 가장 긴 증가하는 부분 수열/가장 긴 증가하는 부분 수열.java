import java.io.*;
import java.util.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(I.readLine());

        int[] dp=new int[1001];
        Arrays.fill(dp,1001);
        dp[0]=0;

        StringTokenizer st=new StringTokenizer(I.readLine());
        int mc=0;
        for(int i=0;i<n;i++){
            int ct=mc,v=Integer.parseInt(st.nextToken());
            while(ct>=0){
                if(dp[ct]<v){
                    dp[ct+1]=Math.min(dp[ct+1],v);
                    break;
                }
                ct--;
            }
            if(ct==mc) mc++;
        }
        System.out.println(mc);
    }
}