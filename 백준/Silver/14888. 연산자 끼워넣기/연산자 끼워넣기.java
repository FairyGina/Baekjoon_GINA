import java.io.*;
import java.util.*;
class Main{
    static int n,max=-1000000000,min=1000000000;
    static boolean[] vt;
    static char[] op,och={'+','-','*','/'};
    static char[] oper;
    static int[] nb;
    static int cc(int a,int b,char c){
        switch(c){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            default:
                return a/b;
        }
    }
    static void cal(int id){
        if(id==n-1){
            int res=nb[0];
            for(int i=0;i<id;i++){
                res=cc(res,nb[i+1],op[i]);
            }
            if(res<min) min=res;
            if(res>max) max=res;
        }
        for(int i=0;i<n-1;i++){
            if(!vt[i]){
                vt[i]=true;
                op[id]=oper[i];
                cal(id+1);
                vt[i]=false;
            }
        }
    }
    static void opera(int st,int ct,char o){
        for(int i=0;i<ct;i++){
            oper[i+st]=o;
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(I.readLine());
        vt=new boolean[n-1];
        op=new char[n-1];
        oper=new char[n-1];
        nb=new int[n];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            nb[i]=Integer.parseInt(st.nextToken());
        }
        int ta=0;
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<4;i++){
            int tm=Integer.parseInt(st.nextToken());
            opera(ta,tm,och[i]);
            ta+=tm;
        }
        cal(0);
        System.out.println(max+"\n"+min);
    }
}