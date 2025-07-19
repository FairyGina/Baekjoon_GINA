import java.io.*;
public class Main{
    static char[][] board=new char[10][10];
    static int[] dy={-1,-1,1,1},dx={-1,1,-1,1};
    static int max;
    static void chess(int y,int x,int ct){
        for(int i=0;i<4;i++){
            int by=y+dy[i],bx=x+dx[i],my=by+dy[i],mx=bx+dx[i];
            if(-1<my&&my<10&&-1<mx&&mx<10&&board[by][bx]=='B'&&board[my][mx]!='B'&&board[my][mx]!='W'){
                board[by][bx]='#';
                chess(my,mx,++ct);
                board[by][bx]='B';
                ct--;
            }
        }
        if(ct>max) max=ct;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int t=Integer.parseInt(I.readLine());
        for(int ti=0;ti<t;ti++){
            max=0;
            String s=I.readLine();
            for(int i=0;i<10;i++){
                s=I.readLine();
                for(int j=0;j<10;j++){
                    board[i][j]=s.charAt(j);
                }
            }
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(board[i][j]=='W'){
                        board[i][j]='#';
                        chess(i,j,0);
                        board[i][j]='W';
                    }
                }
            }
            as.append(max).append('\n');
        }
        System.out.print(as);
    }
}