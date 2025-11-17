import java.io.*;
import java.util.*;

class Main {
    static int[][] vp;
    static int[] nb;
    public static void check(int a, int b, int c){
        if(nb[a]==1 && nb[b]==1) nb[c]=0;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken());
        
        int sz=a+b+c;
        nb=new int[sz+1];
        for(int i=0;i<sz+1;i++) nb[i]=2;
        int ln=Integer.parseInt(I.readLine());
        vp=new int[ln][4];

        for(int i=0;i<ln;i++){
            st=new StringTokenizer(I.readLine());
            for(int j=0;j<4;j++) vp[i][j]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(vp,(q,w) -> w[3]-q[3]);
        int start=0;
        for(int i=0;i<ln;i++){
            if(vp[i][3]==0) break;
            start++;
            nb[vp[i][0]]=1;
            nb[vp[i][1]]=1;
            nb[vp[i][2]]=1;
        }

        for(int i=0;i<2;i++){
            for(;start<ln;start++){
                check(vp[start][0],vp[start][1],vp[start][2]);
                check(vp[start][1],vp[start][2],vp[start][0]);
                check(vp[start][2],vp[start][0],vp[start][1]);
            }
        }

        StringBuilder ans=new StringBuilder();
        for(int i=1;i<sz+1;i++) ans.append(nb[i]).append('\n');
        System.out.print(ans);
    }
}