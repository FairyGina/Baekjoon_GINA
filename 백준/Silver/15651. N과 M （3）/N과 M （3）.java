import java.io.*;
import java.util.*;
class Main{
    static StringBuilder as=new StringBuilder();
    static int n,m;
    static char[] nb;
    static void seq(int id){
        if(id==m){
            as.append(nb);
            return;
        }
        for(int i=1;i<=n;i++){
            nb[id*2]=(char)(i+'0');
            seq(id+1);
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        n=Integer.parseInt(st.nextToken()); m=Integer.parseInt(st.nextToken());
        nb=new char[m*2];
        for(int i=0;i<m-1;i++){
            nb[2*i+1]=' ';
        }
        nb[2*m-1]='\n';
        seq(0);
        System.out.println(as);
    }
}