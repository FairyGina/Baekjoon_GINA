import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        StringTokenizer st=new StringTokenizer(I.readLine());
        int r=Integer.parseInt(st.nextToken()),c=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken())-2;
        char[][] board=new char[r][c];
        for(int i=0;i<r;i++){
            String ts=I.readLine();
            for(int j=0;j<c;j++){
                board[i][j]=ts.charAt(j);
            }
        }
        int max=0,svr=0,svc=0;
        for(int row=1;row<r-k;row++){
            for(int col=1;col<c-k;col++){
                int ct=0;
                for(int i=row;i<row+k;i++){
                    for(int j=col;j<col+k;j++){
                        if(board[i][j]=='*') ct++;
                    }
                }
                if(max<ct){
                    max=ct;
                    svr=row; svc=col;
                }
            }
        }
        as.append(max).append('\n');
        r=svr-1; c=svc-1;
        svr+=k; svc+=k;
        board[r][c]='+';
        board[r][svc]='+';
        board[svr][c]='+';
        board[svr][svc]='+';
        for(int i=svc-k;i<svc;i++){
            board[r][i]='-';
            board[svr][i]='-';
        }
        for(int i=svr-k;i<svr;i++){
            board[i][c]='|';
            board[i][svc]='|';
        }
        for(char[] a:board){
            as.append(a).append('\n');
        }
        System.out.print(as);
    }
}