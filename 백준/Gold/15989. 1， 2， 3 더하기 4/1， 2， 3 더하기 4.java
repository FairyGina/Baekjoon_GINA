import java.io.*;
class Main{
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int[] dp=new int[10001];
        int p=1;
        dp[1]=1; dp[2]=2; dp[3]=3;
        for(int i=4;i<10001;i++){
            if(i%2==0) p++;
            dp[i]=dp[i-3]+p+1;
        }
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            int n=Integer.parseInt(I.readLine());
            as.append(dp[n]).append('\n');
        }
        System.out.print(as);
    }
}