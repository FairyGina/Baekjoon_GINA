import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        boolean[][] board=new boolean[11][11];
        int t=Integer.parseInt(I.readLine());
        for(int ti=1;ti<=t;ti++){
            for(int i=0;i<11;i++){
                Arrays.fill(board[i],false);
            }
            StringTokenizer st=new StringTokenizer(I.readLine());
            int r=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
            int ct=r*c-k,width=1,min=Math.min(r,c);
            for(int i=0;i<k;i++){
                st=new StringTokenizer(I.readLine());
                board[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]=true;
            }
            while(++width<=min){
                r--; c--;
                for(int row=0;row<r;row++){
                    L:for(int col=0;col<c;col++){
                        for(int i=row;i<row+width;i++){
                            for(int j=col;j<col+width;j++){
                                if(board[i][j]) continue L;
                            }
                        }
                        ct++;
                    }
                }
            }
            as.append(String.format("Case #%d: %d\n",ti,ct));
        }
        System.out.print(as);
    }
}