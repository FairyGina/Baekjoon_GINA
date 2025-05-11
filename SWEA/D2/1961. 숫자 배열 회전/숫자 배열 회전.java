import java.io.*;
import java.util.*;
class Solution{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        int ti=Integer.parseInt(I.readLine());

        for(int t=1;t<=ti;t++){
            int n=Integer.parseInt(I.readLine());
            char[][] board=new char[n][n];
            StringBuilder[] as=new StringBuilder[n];

            O.write("#"+t+"\n");

            for(int i=0;i<n;i++){
                as[i]=new StringBuilder();
                StringTokenizer st=new StringTokenizer(I.readLine());
                for(int j=0;j<n;j++){
                    board[i][j]=st.nextToken().charAt(0);
                }
            }
            
            int index=0;
            for(int i=0;i<n;i++){
                for(int j=n-1;j>-1;j--){
                    as[index].append(board[j][i]);
                }
                as[index++].append(' ');
            }

            index=0;
            for(int i=n-1;i>-1;i--){
                for(int j=n-1;j>-1;j--){
                    as[index].append(board[i][j]);
                }
                as[index++].append(' ');
            }

            index=0;
            for(int i=n-1;i>-1;i--){
                for(int j=0;j<n;j++){
                    as[index].append(board[j][i]);
                }
                as[index++].append(' ');
            }

            for(int i=0;i<n;i++){
                O.write(as[i]+"\n");
            }
        }
        O.flush();
    }
}