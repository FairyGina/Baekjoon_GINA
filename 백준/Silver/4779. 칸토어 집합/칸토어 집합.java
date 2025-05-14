import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder(" ");

        String[] dp=new String[13];
        String s=" ";
        dp[0]="-"; dp[1]="- -";
        for(int i=2;i<13;i++){
            as.append(s).append(s);
            s=String.valueOf(as);
            dp[i]=dp[i-1]+s+dp[i-1];
        }
        as=new StringBuilder();
        String n;
        while((n=I.readLine())!=null){
            as.append(dp[Integer.parseInt(n)]).append('\n');
        }
        System.out.println(as);
    }
}