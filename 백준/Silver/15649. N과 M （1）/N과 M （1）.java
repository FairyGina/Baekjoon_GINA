import java.io.*;
import java.util.*;
class Main{
    static StringBuilder as=new StringBuilder();
    static int n,m;
    static int[] nb;
    static boolean[] vt;
    static void seq(int id){
        if(id==m){
            for(int i=0;i<m;i++){
                as.append(nb[i]).append(' ');
            }
            as.append('\n');
            return;
        }
        for(int i=1;i<=n;i++){
            if(!vt[i]){
                vt[i]=true;
                nb[id]=i;
                seq(id+1);
                vt[i]=false;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        n=Integer.parseInt(st.nextToken()); m=Integer.parseInt(st.nextToken());
        nb=new int[m];
        vt=new boolean[n+1];
        seq(0);
        System.out.println(as);
    }
}