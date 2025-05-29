import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        int[] ip=new int[n+1],ans=new int[n],top=new int[1000000];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=1;i<=n;i++){
            ip[i]=Integer.parseInt(st.nextToken());
        }
        int t=-1;
        for(int i=n;i>-1;i--){
            while(t>-1){
                int x=top[t--],id=top[t--];
                if(ip[i]<x){
                    top[++t]=id; top[++t]=x;
                    break;
                }else{
                    ans[id-1]=i;
                }
            }
            top[++t]=i; top[++t]=ip[i];
        }
        for(int i:ans) as.append(i).append(' ');
        System.out.print(as);
    }
}