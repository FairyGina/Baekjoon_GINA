import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine())+1;
        for(int ti=1;ti<t;ti++){
            int n=Integer.parseInt(I.readLine());
            int[] an=new int[n],bn=new int[n];
            StringTokenizer st=new StringTokenizer(I.readLine());
            for(int i=0;i<n;i++){
                an[i]=Integer.parseInt(st.nextToken());
            }
            st=new StringTokenizer(I.readLine());
            for(int i=0;i<n;i++){
                bn[i]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(an);
            Arrays.sort(bn);
            long res=0;
            for(int i=0,j=n-1;i<n;i++,j--){
                res+=(long)an[i]*bn[j];
            }
            as.append(String.format("Case #%d: %d\n",ti,res));
        }
        System.out.print(as);
    }
}