import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int[] pt=new int[101];
        String s;
        while(!(s=I.readLine()).equals("0 0 0")){
            Arrays.fill(pt,0);
            StringTokenizer st=new StringTokenizer(s);
            int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken())-1,k=Integer.parseInt(st.nextToken());
            st=new StringTokenizer(I.readLine());
            for(int i=0;i<k;i++){
                pt[i]=Integer.parseInt(st.nextToken());
            }
            int res=n;
            for(int i=0;i<m;i++){
                int t=n+pt[i%k];
                res+=t;
                n=t;
            }
            as.append(res).append('\n');
        }
        System.out.print(as);
    }
}