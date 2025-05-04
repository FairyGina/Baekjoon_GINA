import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),nu=0,r=0;
        st=new StringTokenizer(I.readLine());
        int[] na=new int[n+1];
        for(int i=1;i<=n;i++){
            na[i]=Integer.parseInt(st.nextToken());
            nu+=na[i];
        }
        r+=k/n*nu;
        b%=n; k%=n;
        for(int i=0;i<k;i++,b++){
            if(b>n) b=1;
            r+=na[b];
        }
        System.out.println(r);
    }
}