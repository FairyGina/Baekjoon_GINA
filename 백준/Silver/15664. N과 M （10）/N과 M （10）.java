import java.io.*;
import java.util.*;
class Main{
    static StringBuilder as=new StringBuilder();
    static int n,m;
    static int[] nb,ip;
    static Set<String> hs;
    static boolean[] vt;

    static void seq(int id,int p){
        if(id==m){
            String t=Arrays.toString(nb);
            if(hs.add(t)){
                for(int i:nb) as.append(i).append(' ');
                as.append('\n');
            }
            return;
        }
        for(int i=p;i<n;i++){
            if(!vt[i]){
                vt[i]=true;
                nb[id]=ip[i];
                seq(id+1,i);
                vt[i]=false;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st=new StringTokenizer(I.readLine());
        n=Integer.parseInt(st.nextToken()); m=Integer.parseInt(st.nextToken());

        hs=new HashSet<>();
        ip=new int[n];
        vt=new boolean[n];

        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n;i++){
            ip[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ip);
        nb=new int[m];

        seq(0,0);
        System.out.println(as);
    }
}