import java.io.*;
import java.util.*;

public class Main {
    static TreeSet<Integer> s1=new TreeSet<>();
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st=new StringTokenizer(I.readLine());

        int n=Integer.parseInt(st.nextToken()),q=Integer.parseInt(st.nextToken());
        int[] time=new int[n-1];
        st=new StringTokenizer(I.readLine());
        for(int i=0;i<n-1;i++) time[i]=Integer.parseInt(st.nextToken());

        StringBuilder ans=new StringBuilder();
        for(int i=0;i<q;i++){
            st=new StringTokenizer(I.readLine());
            int c=Integer.parseInt(st.nextToken()),v=Integer.parseInt(st.nextToken());
            
            if(c==1){
                s1.add(v);
            }else{
                int ct=-1;
                int ln=s1.size();
                if(ln==1){
                    ct=Math.abs(v-s1.first());
                }else if(ln>1){
                    int a1=s1.first(),a2=s1.last();
                    if(a1<v) a1=s1.floor(v);
                    if(a2>v) a2=s1.ceiling(v);
                    ct=Math.min(Math.abs(v-a1),Math.abs(v-a2));
                }
                ans.append(ct).append('\n');
            }
        }
        System.out.print(ans);
    }
}