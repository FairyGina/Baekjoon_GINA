import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n=Integer.parseInt(I.readLine());
        int[] home=new int[n+1],index=new int[n+1];
        StringTokenizer st=new StringTokenizer(I.readLine());
        for(int i=1;i<=n;i++){
            home[i]=Integer.parseInt(st.nextToken());
            index[home[i]]=i;
        }
        int m=Integer.parseInt(I.readLine());
        while(m-->0){
            st=new StringTokenizer(I.readLine());
            int[] cp_home=home.clone(),cp_id=index.clone();
            int mn=Integer.parseInt(st.nextToken()),mx=Integer.parseInt(st.nextToken());
            for(int i=mn;i<=mx;i++){
                cp_home[cp_id[i]]=0;
            }
            int ct=1;
            while(mn<=mx){
                if(cp_home[ct]==0) cp_home[ct]=mn++;
                ct++;
            }
            for(int i=1;i<=n;i++) as.append(cp_home[i]).append(' ');
            as.append('\n');
        }
        System.out.println(as);
    }
}