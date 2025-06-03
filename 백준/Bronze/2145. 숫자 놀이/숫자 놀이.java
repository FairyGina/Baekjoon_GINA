import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int dp[]=new int[100001];
        for(int i=1;i<100001;i++){
            int t=dp[i-1]+1;
            dp[i]=t%10+t/10;
        }
        String s;
        while((s=I.readLine()).charAt(0)!='0'){
            as.append(dp[Integer.parseInt(s)]).append('\n');
        }
        System.out.print(as);
    }
}