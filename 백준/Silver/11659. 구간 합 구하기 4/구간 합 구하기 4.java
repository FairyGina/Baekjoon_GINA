import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
        int[] nb=new int[n],nu=new int[n+1];
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            nb[i]=Integer.parseInt(st.nextToken());
            nu[i+1]=nb[i]+nu[i];
        }
        for(int i=0;i<m;i++){
            st=new StringTokenizer(I.readLine());
            int q=Integer.parseInt(st.nextToken())-1,w=Integer.parseInt(st.nextToken());
            as.append(nu[w]-nu[q]).append('\n');
        }
        System.out.println(as);
    }
}