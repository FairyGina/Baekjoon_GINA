import java.io.*;
import java.util.*;
class Main{
    static int nb[];
    static int ct;
    static void bs(int l,int r,long s){
        int lv=l,rv=r;
        while(lv<=rv){
            int id=(lv+rv)/2,m=nb[id];
            if(m>s) rv=id-1;
            else if(m<s) lv=id+1;
            else{
                ct++;
                return;
            }
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            ct=0;
            int n=Integer.parseInt(I.readLine());
            StringTokenizer st=new StringTokenizer(I.readLine());
            nb=new int[n];
            for(int i=0;i<n;i++){
                nb[i]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(nb);
            int lm=n-2;
            for(int l=0;l<lm;l++){
                for(int r=l+2;r<n;r++){
                    long tp=nb[l]+nb[r];
                    if(tp%2==0) bs(l+1,r-1,tp/2);
                }
            }
            as.append(ct).append('\n');
        }
        System.out.print(as);
    }
}