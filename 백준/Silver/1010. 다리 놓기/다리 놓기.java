import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(I.readLine());
        StringBuilder as=new StringBuilder();
        while(t-->0){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
            if(m-n==0||n==0){
                as.append(1).append('\n');
                continue;
            }
            int mn=Math.min(n, m-n),mx=Math.max(n, m-n);
            ArrayList<Integer> ara=new ArrayList<>(),arb=new ArrayList<>();
            for(int i=m;i>mx;i--) ara.add(i);
            for(int i=mn;i>1;i--) arb.add(i);
            int al=ara.size();
            for(int i=0;i<arb.size();i++){
                int tb=arb.get(i);
                for(int j=0;j<al;j++){
                    int ta=ara.get(j);
                    if(ta%tb==0){
                        ara.remove(j);
                        ara.add(ta/tb);
                        arb.remove(i);
                        break;
                    }
                }
            }
            long q=1,w=1;
            for(int i:ara) q*=i; 
            for(int i:arb) w*=i;
            long res=q/w;
            as.append(res).append('\n');
        }
        System.out.println(as);
    }
}