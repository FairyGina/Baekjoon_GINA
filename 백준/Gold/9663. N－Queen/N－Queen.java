import java.io.*;
class Main{
    static int[][] chess;
    static int n,res=0;
    static void queen(int y,int x,int pm){
        int i=y+1,j;
        for(;i<n;i++){
            chess[i][x]+=pm; //세로
        }

        i=y+1; j=x-1;
        while(!(i>=n||j<0)){ //대각선 왼아래
            chess[i++][j--]+=pm;
        }

        i=y+1; j=x+1;
        while(!(i>=n||j>=n)){ //대각선 오아래
            chess[i++][j++]+=pm;
        }
    }
    static void nq(int dt){
        if(dt==n){
            res++;
            return;
        }
        for(int i=0;i<n;i++){
            if(chess[dt][i]<1){
                queen(dt,i,1);
                nq(dt+1);
                queen(dt,i,-1);
            }
        }
    }

    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        
        n=Integer.parseInt(I.readLine());

        chess=new int[n][n];
        nq(0);

        System.out.println(res);
    }
}