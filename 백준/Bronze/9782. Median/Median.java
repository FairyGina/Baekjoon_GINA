import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s;
        int t=1;
        while(!(s=I.readLine()).equals("0")){
            StringTokenizer st=new StringTokenizer(s);
            int n=Integer.parseInt(st.nextToken());
            int[] nb=new int[n];
            for(int i=0;i<n;i++){
                nb[i]=Integer.parseInt(st.nextToken());
            }
            as.append(String.format("Case %d: %.1f\n",t++,n%2==0?(double)(nb[n/2-1]+nb[n/2])/2:nb[n/2]));
        }
        System.out.print(as);
    }
}