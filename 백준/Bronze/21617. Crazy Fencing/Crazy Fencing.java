import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        double res=0;
        int n=Integer.parseInt(I.readLine());
        int[] h=new int[n+1];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<=n;i++){
            h[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            res+=(h[i]+h[i+1])*Integer.parseInt(st.nextToken())/2.0;
        }
        System.out.print(res);
    }
}