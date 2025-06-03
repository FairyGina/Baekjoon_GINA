import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int dp[]=new int[100001];
        int ct=1;
        for(int i=1;i<100001;i++){
            dp[i]=ct++;
            if(ct>9) ct=1;
        }
        String s;
        while(!(s=I.readLine()).equals("0")){
            as.append(dp[Integer.parseInt(s)]).append('\n');
        }
        System.out.print(as);
    }
}