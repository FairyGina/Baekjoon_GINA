import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine());
        StringTokenizer st=new StringTokenizer(I.readLine());
        int sa=Integer.parseInt(st.nextToken()),sb=Integer.parseInt(st.nextToken()),sc=Integer.parseInt(st.nextToken());
        for(int i=1;i<n;i++){
            st=new StringTokenizer(I.readLine());
            int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken());
            int ta=Math.min(sb+a,sc+a),tb=Math.min(sa+b,sc+b),tc=Math.min(sa+c,sb+c);
            sa=ta; sb=tb; sc=tc;
        }
        System.out.print(Math.min(Math.min(sa,sb),sc));
    }
}