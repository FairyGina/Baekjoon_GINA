import java.io.*;
import java.util.*;
class Main{
    static int mx=0,id=0,amx=0;
    static int[] ch=new int[3],nb=new int[5];
    static boolean[] vt=new boolean[5];
    static void dfs(int dt){
        if(dt==3){
            int res=0;
            for(int i=0;i<3;i++){
                res+=ch[i];
            }
            res%=10;
            if(res>mx) mx=res;
            return;
        }
        for(int i=0;i<5;i++){
            if(!vt[i]){
                vt[i]=true;
                ch[dt]=nb[i];
                dfs(dt+1);
                ch[dt]=0;
                vt[i]=false;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        for(int i=1;i<=t;i++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            for(int j=0;j<5;j++){
                nb[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.fill(ch,0);
            Arrays.fill(vt,false);
            mx=0;
            dfs(0);
            if(mx>=amx){
                id=i;
                amx=mx;
            }
        }
        System.out.print(id);
    }
}