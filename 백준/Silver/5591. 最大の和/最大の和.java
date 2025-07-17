import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
        int[] num=new int[n+1];
        for(int i=1;i<=n;i++){
            num[i]+=num[i-1]+Integer.parseInt(I.readLine());
        }
        int max=num[k];
        for(int i=k+1;i<=n;i++){
            int t=num[i]-num[i-k];
            if(max<t) max=t;
        }
        System.out.print(max);
    }
}