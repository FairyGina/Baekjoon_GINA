import java.io.*;
import java.util.*;
class Main{
    static int[] line;
    static int n,k;
    static long f(int max){
        long l=0,r=max,m=max;
        while(r>l+1){
            int ct=0;
            for(int i=0;i<k;i++){
                ct+=line[i]/m;
            }
            if(ct<n) r=m;
            else if(ct>=n) l=m;
            m=(l+r)/2;
        }
        return m;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(I.readLine());
        k=Integer.parseInt(st.nextToken());n=Integer.parseInt(st.nextToken());
        line=new int[k];

        int m=0;
        for(int i=0;i<k;i++){
            line[i]=Integer.parseInt(I.readLine());
            if(line[i]>m) m=line[i];
        }
        System.out.println(f(m));
    }
}