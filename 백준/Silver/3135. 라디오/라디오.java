import java.io.*;
import java.util.*;
class Main{
    static int cur,wt;
    static int wt_m(int m){
        int mr=wt-m;
        if(m!=cur) mr++;
        return mr;
    }
    static int m_wt(int m){
        int mr=m-wt;
        if(m!=cur) mr++;
        return mr;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st=new StringTokenizer(I.readLine());
        cur=Integer.parseInt(st.nextToken()); wt=Integer.parseInt(st.nextToken());

        int n=Integer.parseInt(I.readLine());
        int[] button=new int[n+1];
        button[0]=cur;
        for(int i=1;i<=n;i++){
            button[i]=Integer.parseInt(I.readLine());
        }

        Arrays.sort(button);
        int min=0,max=0,res=1;
        boolean bp=true;
        for(int i=0;i<=n;i++){
            if(button[i]<wt) min=button[i]; 
            else if(button[i]>wt){
                max=button[i];
                break;
            }else{
                if(button[i]==cur) res--;
                bp=false;
                break;
            }
        }
        if(bp){
            if(max==0){
            res=wt_m(button[n]);
            }else if(min==0){
                res=m_wt(button[0]);
            }
            else{
                int minr=wt_m(min),maxr=m_wt(max);
                res=minr>maxr?maxr:minr;
            }
        }

        System.out.println(res);
    }
}