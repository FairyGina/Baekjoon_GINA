import java.io.*;
import java.util.*;
class Main{
        static int res=0,n,k;
        static int[] sb;
        static boolean b=false;
        static void sum(int ct){
            if(b) return;
            if(ct==n-1){
                res++;
                if(res==k){
                    StringBuilder as=new StringBuilder();
                    for(int i=0;i<n;i++){
                        if(sb[i]==0) continue;
                        as.append(String.format("%d+",sb[i]));
                    }
                    as.deleteCharAt(as.length()-1);
                    System.out.println(as);
                    if(b==false) b=true;
                }
                return;
            }
            for(int i=1;i<n-ct;i++){
                if(i>3) break;
                ct+=i;
                sb[ct]=i;
                sum(ct);
                sb[ct]=0;
                ct-=i;
            }
        }
        public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        n=Integer.parseInt(st.nextToken()); k=Integer.parseInt(st.nextToken());
        sb=new int[n];
        sum(-1);
        if(!b) System.out.println(-1);
    }
}