import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        long[][] tri=new long[n][n];
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            for(int j=0;j<=i;j++){
                tri[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                tri[i-1][j]+=Math.max(tri[i][j],tri[i][j+1]);
            }
        }
        System.out.print(tri[0][0]);
    }
}