import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int[] r=new int[16],g=new int[16],b=new int[16];
        for(int i=0;i<16;i++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            r[i]=Integer.parseInt(st.nextToken());
            g[i]=Integer.parseInt(st.nextToken());
            b[i]=Integer.parseInt(st.nextToken());
        }
        String s;
        
        while((s=I.readLine())!=null){
            StringTokenizer st=new StringTokenizer(s);
            int q=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());

            int mn=195076,id=0;
            String ms="";
            for(int i=0;i<16;i++){
                int tr=r[i]-q,tg=g[i]-w,tb=b[i]-e;
                int nu=tr*tr+tg*tg+tb*tb;
                if(mn>nu){
                    mn=nu;
                    ms=s;
                    id=i;
                }
            }

            st=new StringTokenizer(ms);
            ms=String.format("%3s %3s %3s",st.nextToken(),st.nextToken(),st.nextToken());
            s=String.format(" %3s %3s %3s",r[id],g[id],b[id]);
            as.append(ms).append(" maps to").append(s).append('\n');
            
        }
        System.out.println(as);
    }
}