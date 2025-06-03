import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st=new StringTokenizer(I.readLine(),":");
        int cur=Integer.parseInt(st.nextToken())*3600+Integer.parseInt(st.nextToken())*60+Integer.parseInt(st.nextToken());

        st=new StringTokenizer(I.readLine(),":");
        int mis=Integer.parseInt(st.nextToken())*3600+Integer.parseInt(st.nextToken())*60+Integer.parseInt(st.nextToken());

        int ans=mis-cur;

        if(ans<0) ans+=86400;
        int h=ans/3600;
        ans%=3600;
        int m=ans/60;
        ans%=60;
        System.out.printf("%02d:%02d:%02d",h,m,ans);
    }
}