import java.io.*;
import java.util.*;

class Main {
    static int[][] mv={{-1,0}, {1,0}, {0,-1}, {0,1}};
    static char[][] board;
    static int y,x,ink;
    static int N;
    static char color;

    public static void f1(int idx){
        int ty=y+mv[idx][0],tx=x+mv[idx][1];
        if(0<=ty && ty<N && 0<=tx && tx<N && board[ty][tx]=='.'){
            board[y][x]='.';
            board[ty][tx]='@';
            y=ty; x=tx;
        }
    }

    public static void f2(){
        int cx=x,count=1;
        for(int r=y-ink;r<y;r++){
            for(int c=cx;c<cx+count;c++){
                if(0<=r && r<N && 0<=c && c<N && board[r][c]!='.' && board[r][c]!='@') board[r][c]=color;
            }
            cx--;
            count+=2;
        }

        for(int r=y;r<=y+ink;r++){
            for(int c=cx;c<cx+count;c++){
                if(0<=r && r<N && 0<=c && c<N && board[r][c]!='.' && board[r][c]!='@') board[r][c]=color;
            }
            cx++;
            count-=2;
        }
        ink=0;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(I.readLine());
        int II=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        char[] colorarr=I.readLine().toCharArray();
        board=new char[N][N];
        for(int i=0;i<N;i++){
            String ips=I.readLine();
            for(int j=0;j<N;j++){
                board[i][j]=ips.charAt(j);
            }
        }
        char[] orderarr=I.readLine().toCharArray();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(board[i][j]=='@'){
                    y=i; x=j;
                }
            }
        }
        String odlist="UDLRJj";
        ink=0;
        int inkidx=0;

        for(char order:orderarr){
            int fdx=odlist.indexOf(order);
            if(fdx<4) f1(fdx);
            else if(fdx<5){
                color=colorarr[inkidx];
                f2();
                inkidx=(inkidx+1)%II;
            }
            else ink++;
        }
        StringBuilder ans=new StringBuilder();
        for(char[] carr:board){
            ans.append(new String(carr)).append("\n");
        }
        System.out.print(ans);
    }
}