import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int[][] board=new int[101][101];
        
        int t=Integer.parseInt(I.readLine());
        for(int ti=0;ti<t;ti++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            int x=Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
            for(int my=y;my<y+10;my++){
                 for(int mx=x;mx<x+10;mx++){
                    board[my][mx]=1;
                }
            }
        }
        int num=0;
        for(int i=0;i<101;i++){
            for(int j=0;j<101;j++){
                num+=board[i][j];
            }
        }
        System.out.print(num);
    }
}