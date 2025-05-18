import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(I.readLine());
        int[] nb=new int[n+1];
        for(int i=1;i<=n;i++){
            nb[i]=Integer.parseInt(I.readLine());
        }
        Arrays.sort(nb);
        int[] num=new int[n+1];
        for(int i=1;i<=n;i++){
            num[i]=num[i-1]+nb[i];
        }
        int m=(int)Math.round(3*(double)n/20);
        double r=Math.round((num[n-m]-num[m])/(double)(n-2*m));

        System.out.println(String.format("%.0f",r));
    }
}