import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        StringTokenizer st=new StringTokenizer(I.readLine());
        int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(I.readLine());
        int[] pz=new int[n],num=new int[n+1];
        for(int i=0;i<n;i++){
            pz[i]=Integer.parseInt(I.readLine());
        }
        Arrays.sort(pz);
        for(int i=0,j=n-1;i<n;i++,j--){
            num[i+1]=pz[j]+num[i];
        }
        int max=0;
        n++;
        for(int i=0;i<n;i++){
            int td=(c+num[i])/a;
            if(td>max) max=td;
            a+=b; 
        }
        System.out.print(max);
    }
}