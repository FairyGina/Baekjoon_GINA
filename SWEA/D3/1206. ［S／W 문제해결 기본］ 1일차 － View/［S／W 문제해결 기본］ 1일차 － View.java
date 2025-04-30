import java.io.*;
import java.util.*;
class Solution{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();

        for(int i=1;i<11;i++){
            int n=Integer.parseInt(I.readLine()),r=0;
            StringTokenizer st=new StringTokenizer(I.readLine());
            int[] bd=new int[n];
            for(int j=0;j<n;j++){
                bd[j]=Integer.parseInt(st.nextToken());
            }
            n=n-2;
            for(int j=2;j<n;j++){
                int m=Math.max(Math.max(bd[j-2],bd[j-1]),Math.max(bd[j+1],bd[j+2]));
                if(bd[j]>m) r+=bd[j]-m;
            }
            as.append("#").append(i).append(" ").append(r).append('\n');
        }   
        System.out.println(as);
    }
}