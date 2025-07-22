import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),t=Integer.parseInt(st.nextToken()),p=Integer.parseInt(st.nextToken())-1;
        int[][] hm=new int[n+1][t],pn=new int[n][t];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(I.readLine());
            for(int j=0;j<t;j++){
                hm[i][j]=Integer.parseInt(st.nextToken());
                if(hm[i][j]==0) hm[n][j]++;
            }
        }
        for(int i=0;i<n;i++){
            int sc=0,ct=0;
            pn[i][2]=i;
            for(int j=0;j<t;j++){
                if(hm[i][j]==1){
                    ct++;
                    sc+=hm[n][j];
                }
            }
            pn[i][0]=sc;
            pn[i][1]=ct;
        }
        Arrays.sort(pn,(a,b)->{
            if(b[0]!=a[0]) return b[0]-a[0];
            if(b[1]!=a[1]) return b[1]-a[1];
            return a[2]-b[2];
        });
        for(int i=0;i<n;i++){
            if(pn[i][2]==p){
                System.out.print(pn[i][0]+" "+(i+1));
            }
        }
    }
}