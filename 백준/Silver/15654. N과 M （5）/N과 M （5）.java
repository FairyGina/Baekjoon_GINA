import java.io.*;
import java.util.*;
class Main{
    static StringBuilder as=new StringBuilder();
    static int n,m;
    static int[] nb;
    static int[] ip;
    static boolean[] vt;
    static void seq(int id){
        if(id==m){
            for(int i=0;i<m;i++){
                as.append(nb[i]).append(' ');
            }
            as.append('\n');
            return;
        }
        for(int i=0;i<n;i++){
            if(!vt[i]){
                nb[id]=ip[i];
                vt[i]=true;
                seq(id+1);
                vt[i]=false;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st=new StringTokenizer(I.readLine());
        n=Integer.parseInt(st.nextToken()); m=Integer.parseInt(st.nextToken());
        ip=new int[n]; vt=new boolean[n];
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            ip[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ip);
        nb=new int[n];
        seq(0);
        System.out.println(as);
    }
}