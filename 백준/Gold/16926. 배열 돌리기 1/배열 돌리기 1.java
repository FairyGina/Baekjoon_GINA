import java.io.*;
import java.util.*;
class Main{
    static int[][] square;
    static int miny,maxy,minx,maxx;
    static void rotation(){
        int ta=square[maxy][miny];
        for(int i=maxy;i>miny;i--){
            square[i][minx]=square[i-1][minx];
        }
        for(int i=minx;i<maxx;i++){
            square[miny][i]=square[miny][i+1];
        }
        for(int i=miny;i<maxy;i++){
            square[i][maxx]=square[i+1][maxx];
        }
        for(int i=maxx;i>minx;i--){
            square[maxy][i]=square[maxy][i-1];
        }
        square[maxy][minx+1]=ta;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        StringTokenizer st=new StringTokenizer(I.readLine());
        int n=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken()),r=Integer.parseInt(st.nextToken());
        square=new int[n][m];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(I.readLine());
            for(int j=0;j<m;j++){
                square[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<r;i++){
            miny=0; maxy=n-1;
            minx=0; maxx=m-1;
            while(miny<maxy&&minx<maxx){
                rotation();
                miny++;maxy--;minx++;maxx--;
            }
        }
        for(int[] i:square){
            for(int j:i) as.append(j).append(' ');
            as.append('\n');
        }
        System.out.println(as);
    }
}