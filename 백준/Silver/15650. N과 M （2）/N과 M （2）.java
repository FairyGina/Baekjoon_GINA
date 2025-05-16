import java.io.*;
import java.util.*;
class Main{
    static StringBuilder as=new StringBuilder();
    static int n,m;
    static int[] nb;
    static void seq(int id,int p){
        if(id==m){
            for(int i=0;i<m;i++){
                as.append(nb[i]).append(' ');
            }
            as.append('\n');
            return;
        }
        for(int i=p;i<=n;i++){
            nb[id]=i;
            seq(id+1,i+1);
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        n=Integer.parseInt(st.nextToken()); m=Integer.parseInt(st.nextToken());
        nb=new int[m];
        
        seq(0,1);
        System.out.println(as);
    }
}