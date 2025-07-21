import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        StringTokenizer st=new StringTokenizer(I.readLine(),":");
        int sh=Integer.parseInt(st.nextToken()),sm=Integer.parseInt(st.nextToken()),sc=Integer.parseInt(st.nextToken()),t1=sh*3600+sm*60+sc;
        st=new StringTokenizer(I.readLine(),":");
        sh=Integer.parseInt(st.nextToken()); sm=Integer.parseInt(st.nextToken()); sc=Integer.parseInt(st.nextToken());
        int t2=sh*3600+sm*60+sc;
        int res=(86400+t2-t1)%86400;
        if(res==0) res=86400;
        sh=res/3600;
        res%=3600;
        sm=res/60;
        res%=60;        
        System.out.print(String.format("%02d:%02d:%02d",sh,sm,res%60));     
    }
}