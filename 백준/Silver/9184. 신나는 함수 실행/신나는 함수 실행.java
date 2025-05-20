import java.io.*;
import java.util.StringTokenizer;
class Main{
    static int[][][] dp;
    static int lm;
    static void push1(int x,int y,int z){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                for(int k=0;k<z;k++){
                    dp[i][j][k]=1;
                }
            }
        }
    }
    static void push2(int x,int y,int z){
        for(int i=x;i<lm;i++){
            for(int j=y;j<lm;j++){
                for(int k=z;k<lm;k++){
                    dp[i][j][k]=dp[71][71][71];
                }
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int z=52,tw=72; lm=102;
        dp=new int[lm][lm][lm];

        push1(z,lm,lm);
        push1(lm,z,lm);
        push1(lm,lm,z);

        for(int i=z;i<tw;i++){
            for(int j=z;j<tw;j++){
                for(int k=z;k<tw;k++){
                    dp[i][j][k]=dp[i-1][j][k]-dp[i-1][j-1][k-1]+dp[i-1][j-1][k]+dp[i-1][j][k-1];
                }
            }
        }

        for(int i=z;i<tw;i++){
            for(int j=i+1;j<tw;j++){
                for(int k=j+1;k<tw;k++){
                    dp[i][j][k]=dp[i][j][k-1]-dp[i][j-1][k]+dp[i][j-1][k-1];
                }
            }
        }

        push2(tw,z,z);
        push2(z,tw,z);
        push2(z,z,tw);
        String s;
        StringBuilder as=new StringBuilder();
        while(!((s=I.readLine()).equals("-1 -1 -1"))){
            StringTokenizer st=new StringTokenizer(s);
            int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken());
            String ts=String.format("w(%d, %d, %d) = %d\n",a,b,c,dp[a+51][b+51][c+51]);
            as.append(ts);
        }
        System.out.println(as);
    }
}