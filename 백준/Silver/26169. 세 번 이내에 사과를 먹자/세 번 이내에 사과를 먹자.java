import java.io.*;
import java.util.*;
class Main{
    static boolean bl=false;
    static int res=0;
    static int[] ax={0,1,0,-1},ay={-1,0,1,0};
    static int[][] board=new int[5][5];
    static void apple(int dt,int y,int x){
        if(bl==true) return;
        if(dt==3){
            if(res>1) bl=true;
            return;
        }
        for(int i=0;i<4;i++){
            int ty=y+ay[i],tx=x+ax[i];
            if(tx<0||tx>4||ty<0||ty>4||board[ty][tx]<0) continue;
            int tp=board[ty][tx];
            res+=tp;
            board[ty][tx]=-1;
            apple(dt+1,ty,tx);
            board[ty][tx]=tp;
            res-=tp;
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            for(int j=0;j<5;j++){
                board[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        StringTokenizer st=new StringTokenizer(I.readLine());
        int y=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken());
        board[y][x]=-1;
        apple(0,y,x);
        System.out.print(bl==true?1:0);
    }
}