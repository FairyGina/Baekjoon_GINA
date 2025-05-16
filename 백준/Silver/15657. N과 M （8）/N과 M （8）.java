import java.io.*;
import java.util.*;
class Main{
    static StringBuilder as=new StringBuilder();
    static int n,m;
    static int[] nb;
    static int[] ip;

    static void seq(int id,int p){
        if(id==m){
            for(int i=0;i<m;i++){
                as.append(nb[i]).append(' ');
            }
            as.append('\n');
            return;
        }
        for(int i=p;i<n;i++){
            nb[id]=ip[i];
            seq(id+1,i);
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st=new StringTokenizer(I.readLine());
        n=Integer.parseInt(st.nextToken()); m=Integer.parseInt(st.nextToken());

        ip=new int[n];
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            ip[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ip);
        nb=new int[n];

        seq(0,0);
        System.out.println(as);
    }
}