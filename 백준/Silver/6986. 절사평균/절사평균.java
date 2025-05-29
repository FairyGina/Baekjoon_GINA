import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
        double[] avg=new double[n],num=new double[n+1];
        for(int i=0;i<n;i++){
            avg[i]=Math.round(Double.parseDouble(I.readLine())*100);
        }
        Arrays.sort(avg);
        for(int i=1;i<=n;i++){
            num[i]+=Math.round((avg[i-1]+num[i-1]));
        }
        double f=num[k+1]-num[k],b=num[n-k]-num[n-k-1],m=num[n-k]-num[k];
        System.out.printf("%.2f\n%.2f",m/(100*(n-2*k)),(m+k*(f+b))/(100*n));
    }
}